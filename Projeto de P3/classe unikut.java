package unikut.pkg2gq;

//import View.UnikutView;
/*
 * @author Valmir
 */
public class Unikut {

	private Conta[] contas;
	private int indiceConta;
	
	public Conta currentAccount;
	private UnikutView view;
	
	// tudo que tiver menu some

	public Unikut() {
		indiceConta = 0;
		contas = new Conta[1000];
	}
	
	public void startView() {
		view =new UnikutView(this);
		view.menuStart();
	}
	
	// Logica de negocio
	// Cria Conta
	public Conta criarConta(String login, String nickName, String password) {
		Conta novaConta= new Conta(login, nickName, password);
		contas[indiceConta] = novaConta;
		indiceConta++;
		return novaConta;
	}

	// Verifica se ja existe o login criado
	public boolean verificaLogin(String login) {
		boolean loginFound = false;
		for (int i = 0; i < indiceConta; i++) {
			if (login.equals(contas[i].getLogin())) {
				loginFound = true;
				break;
			}
		}

		return loginFound;
	}

	// Verifica se a senha existe e se Ã© a do login correspondente
	public boolean verificaSenha(String login, String senha) {
		Conta conta = this.pesquisarPessoas(login);
		if (conta != null) {
			return senha.equals(conta.getSenha());
		}
		return false;

	}

	// Pesquisa contas ja Cadastradas
	public Conta pesquisarPessoas(String login) {
		for (int i = 0; i <= indiceConta; i++) {
			if (login.equals(contas[i].getLogin())) {
				return contas[i];
			}
		}
		return null;
	}

	// Editar Nome
	public void alterarContaNome(String login, String novoNome) {
		Conta conta = this.pesquisarPessoas(login);
		conta.setNome(novoNome);
	}

	// Editar Senha
	public void alterarContaSenha(String login, String novaSenha) {
		Conta conta = this.pesquisarPessoas(login);
		conta.setSenha(novaSenha);
	}

	// Retorna uma lista de solicitacoes de amizade o currentAccount, ou null caso nao existam solicitacoes
	public Amigo[] getSolicitacoesPendentes() {
		// vaculhar minhas contas
		Amigo[] solicitacoesPendentes = new Amigo[1000];
		int contadorDeAmigosPendentes = 0;
		for (int i = 0; i < indiceConta; i++) {
			Conta conta = contas[i];
			// nao incluir eu mesmo na busca
			if (!(currentAccount == conta)) {
				// vasculhar array de amigos de cada conta 
				Amigo[] amigosDaConta = conta.getAmigos();
				for (int j = 0; j < conta.getQuantidadeDeAmigos(); j++) {
					// encontrar solicitacoes pendentes apontando pra mim
					Amigo amigo = amigosDaConta[j];
					if (amigo.getPara().equals(currentAccount.getLogin()) && amigo.getPendente()) {
						solicitacoesPendentes[contadorDeAmigosPendentes] = amigo;
						contadorDeAmigosPendentes++;
					}
				}
			}
		}
		if (contadorDeAmigosPendentes > 0) {
			return solicitacoesPendentes;
		}
		
		return null;
	}
}
