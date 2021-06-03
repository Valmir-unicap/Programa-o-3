//package unikut.pkg2gq;

package View;

import java.util.Scanner;

import Logica.Amigo;
import Logica.Conta;
import Logica.Mensagem;
import Logica.Unikut;

/*
     Equipe:
   @author André
   @author Lucas
   @author Pedro
   @author Valmir
*/

//Observação: A Thread é acionada, quando o usuário adiciona um novo amigo.

public class UnikutView {
	private Scanner s = new Scanner(System.in);
	private Unikut controller;
	
	public UnikutView(Unikut cont) {
		controller = cont;
	}
	
	public void menuStart() {
		System.out.println("Bem vindo ao UNIKUT!\n");
		System.out.println("Eh novo por aqui?");
		System.out.println("1 => Criar Nova Conta\n");

		System.out.println("Ja tem cadastro?");
		System.out.println("2 => Entrar na sua conta\n");

		System.out.println("Quer Nos Abandonar?");
		System.out.println("3 => para Sair");
		System.out.print("=>");

		int opcao = s.nextInt();
		s.nextLine();
		while (opcao != 3) {
			switch (opcao) {
			case 1:
				mostrarCriarConta();
				menuLogado();
			break;
			case 2 :
				mostrarLogin();
				menuLogado();
			break;
                        default :
                            System.out.println("\nComando inválido");
			}
		}
		
		System.out.println("Unikut encerrado!!!");
		Runtime.getRuntime().exit(0);
	}
	
	public void mostrarCriarConta() {
		// Criar Nova Conta
		String login, nickName, password, passwordConfirm;
		System.out.print("\nCriar Login: ");
		login = s.nextLine();
		while (login.length() == 0) {
			System.out.print("\nErro:\nLogin Nao Pode Ser Vazio\nPor Favor criar outro Login: ");
			login = s.nextLine();
		}
		// Verifica se o login ja existe
		while (controller.verificaLogin(login)) {
			System.out.print("\nErro:\nLogin Ja Existente\nPor Favor criar outro Login: ");
			login = s.nextLine();
		}

		System.out.print("Criar Apelido (Opcional): ");
		nickName = s.nextLine();

		System.out.print("\nCrie uma senha: ");
		password = s.nextLine();
		//Verifica se a senha 1 esta vazia 
		while (password.length() == 0) {
			System.out.print("\nErro:\nSenha nao pode ser vazio: ");
			password = s.nextLine();
		}
		
		System.out.print("\nDigite a senha novamente: ");
		passwordConfirm = s.nextLine();
		
		// Verifica se as senhas estão iguais
		while (!password.equals(passwordConfirm)) {
			System.out.print("\nSuas senhas nao estao compativeis\nDigite novamente a senha: ");
			password = s.next();
			System.out.print("\nVerifique a senha: ");
			passwordConfirm = s.next();
		}
		// Se Nao inserir o nome, o mesmo recebe "Convidado"
		if (nickName.isEmpty() == true) {
			nickName = "Convidado!";
		}
		// System.out.println("\nBem Vindo Ao UNIKUT!");
		System.out.println(nickName + "!");
		System.out.println("Conta criada com sucesso...");

		// Criando a conta com os atributos coletados
		controller.currentAccount = controller.criarConta(login, nickName, password);
	}
	
	public void menuAddAmigos() {
		System.out.println("\nOla " + controller.currentAccount.getNome() + ".");
		System.out.println("\nMenu Adicionar Amigos");
		System.out.println("1 => Adicionar Amigo");
		System.out.println("2 => Voltar para o menu anterior");
		System.out.print("=>");
		int opcao = s.nextInt();
		s.nextLine();
		while (opcao != 2) {
			switch (opcao) {
				case 1 : // Adicionar amigo.
					System.out.println("\nDigite o login do amigo que quer adicionar:");
					String friendLogin = s.nextLine();
					while (!controller.verificaLogin(friendLogin)) {
						System.out.print("\nErro:\nNão encontramos esse usuario!!\nPor Favor digite novamente o login do seu amigo: ");
						friendLogin = s.nextLine();
					}
					controller.currentAccount.convidarAmigo(friendLogin);
					System.out.println("\nUm convite foi enviado para o amigo: " + friendLogin);
                                        
                                        //Criação da Thread
                                        System.out.println("Thread iniciada!");
                                        Thread novo= new Thread (new FazCoisas());
                                        Thread t= new Thread(new FazOutrasCoisas());
                                        novo.start();
                                        t.start();
                                        try{
                                        novo.join();//junção, ela se dividiu porém vai se encontrar de novo.
                                        mostrarAmigos();//mostrar amigos
                                        t.join();//junção, ela se dividiu porém vai se encontrar de novo.
                                        menuRecados();//envia um recado 
                                        }catch(InterruptedException e){
                                            System.out.println("erro!!!");
                                        }
                                        System.out.println("Thread finalizada!");//Fim da Thread
                                        
				break;
			}
			menuAddAmigos();
		}
		menuLogado();
	}
	
	public void menuLogado() {
		System.out.println("\nOla " + controller.currentAccount.getNome() + ".");
		System.out.println("Seu Feed:\n");
		System.out.println("1 => Editar Perfil");
		System.out.println("2 => Ver Amigos");
		System.out.println("3 => Adicionar Amigos");
		System.out.println("4 => Recados");
		System.out.println("5 => para Sair");
		System.out.print("=>");
		int opcao = s.nextInt();
		s.nextLine();
		while (opcao != 5) {
			switch (opcao) {
			case 1 : // Editar perfil
				menuEditar();
			break;
			case 2 : // Exibir amigos
				mostrarAmigos();
			break;
			case 3 : // Adicionar amigos
				menuAddAmigos();
			break;
			case 4 : // Enviar recados
				menuRecados();
			break;
                        default :
                            System.out.println("\nComando inválido");
			}
			menuLogado();
			opcao = s.nextInt();
			s.nextLine();
		}

		System.out.println("Ate a proxima " + controller.currentAccount.getNome() + "!");
		menuStart();
	}
	
	public void menuEditar() {
		System.out.println("\nOla " + controller.currentAccount.getNome() + ".");
		System.out.println("\nMenu Alterar Conta");
		System.out.println("1 => Editar Apelido");
		System.out.println("2 => Editar Senha");
		System.out.println("3 => Voltar ao menu anterior");
		System.out.print("=>");
		int opcao = s.nextInt();
		s.nextLine();
		while (opcao != 3) {
			switch (opcao) {
			case 1 : // Alterar Apelido
				System.out.println("\nNovo Apelido:");
				String newNickName = s.nextLine();
				controller.alterarContaNome(controller.currentAccount.getLogin(), newNickName);
				System.out.println("\nApelido alterado com sucesso!");
			break;
			case 2 : // Alterar Senha
				System.out.println("\nNova Senha:");
				String newPassword = s.nextLine();
				controller.alterarContaSenha(controller.currentAccount.getLogin(), newPassword);
				System.out.println("\nSenha alterada com sucesso!");
			break;
                        default : System.out.println("\nComando inválido");
			}
			menuEditar();
		}
		menuLogado();
	}
	
	public void menuRecados() {
		System.out.println("\nOla " + controller.currentAccount.getNome() + ".");
		System.out.println("Menu Recados:\n");
		System.out.println("1 => Visualizar Recados");
		System.out.println("2 => Enviar Recados");
		System.out.println("3 => Voltar ao menu anterior");
		int opcao = s.nextInt();
		s.nextLine();
		while (opcao != 3) {
			switch (opcao) {
			case 1 : // Visualizar recados
				Mensagem[] mensagens = controller.currentAccount.getMensagens();
				if (mensagens != null) {
					for (int i = 0; i < controller.currentAccount.getQuantidadeDeMensagens(); i++) {
                                        Mensagem mensagem = mensagens[i];
                                        System.out.println("De: " + controller.pesquisarPessoas(mensagem.getDe()).getNome() + " Para: " + controller.pesquisarPessoas(mensagem.getPara()).getNome() + " Recado: " + mensagem.getMensagem());
                                    }
				} else {
                                    System.out.println("Vc nao possui nenhum recado");
				}
			break;
			case 2 : // Enviar recado
				System.out.println("digite o login do usuario que vai receber a mensagem:");
				String login = s.nextLine();
				while (!controller.verificaLogin(login)) {
					System.out.print("\nErro:\nNão encontramos esse usuario!!\nPor Favor digite novamente o login do seu amigo: ");
					login = s.nextLine();
				}
				System.out.println("digite a mensagem a ser enviada:");
				String mensagem = s.nextLine();
				Mensagem msg = new Mensagem(login, controller.currentAccount.getLogin(), mensagem);
				controller.currentAccount.addMensagem(msg);
				Conta conta = controller.pesquisarPessoas(login);
				conta.addMensagem(msg);
			break;
                        default : System.out.println("\nComando inválido");
			}
			System.out.println();
			menuRecados();
		}
		System.out.println();
		menuLogado();
	}
	
	public void mostrarLogin() {
		System.out.print("\nLogin: ");
		String login, password;
		login = s.nextLine();
		while (!controller.verificaLogin(login)) {
			System.out.print("\nErro:\nLogin Não Existente\nPor Favor usar outro Login: ");
			login = s.nextLine();
		}
		System.out.print("Senha: ");
		password = s.nextLine();
		while (!controller.verificaSenha(login, password)) {
			System.out.print("\nErro:\nSenha Incorreta\n\nPor Favor tente novamente: ");
			password = s.nextLine();
		}

		controller.currentAccount = controller.pesquisarPessoas(login);

		System.out.println("\nBem vindo " + controller.currentAccount.getNome() + "!");
	}
	
	public void mostrarAmigos() {
		Amigo[] amigos = controller.currentAccount.getAmigos();
		if (amigos != null) {
			System.out.println("Solicitacao enviado por vc:");
			for (int i = 0; i < amigos.length; i ++) {
				if (amigos[i] != null) {
					Amigo amigo = amigos[i];
					Conta contaDoAmigo = controller.pesquisarPessoas(amigo.getPara());
					String status = amigo.getPendente() ? "pendente" : "aceito";
					System.out.println(contaDoAmigo.getNome() + " status: " + status);
				}
			}
		} else {
			System.out.println("Vc ainda nao possui amigos!");
		}
		
		System.out.println();
		int opcao = 0;
		Amigo[] solicitacoesPendentes = controller.getSolicitacoesPendentes();
		if (solicitacoesPendentes != null) {
			System.out.println("Solicitacoes pendentes enviadas para vc:");
			for (int i = 0; i < solicitacoesPendentes.length; i ++) {
				if (solicitacoesPendentes[i] != null) {
					Amigo amigo = solicitacoesPendentes[i];
					Conta contaDoAmigo = controller.pesquisarPessoas(amigo.getDe());
					System.out.println("Convite de: " + contaDoAmigo.getNome() + " numero: " + (i+1));
				}
			}
			System.out.println("Digite o numero da solicitacao para aceitar e depois 0 para sair.");
			opcao = s.nextInt();
			while (opcao != 0) {
				solicitacoesPendentes[opcao - 1].setPendente(false);
				opcao = s.nextInt();
			}
		} else {
			System.out.println("Vc nao possui solicitacoes de amizade pendentes.");
		}
		
		while (opcao != 1) {
			System.out.println("1 => Voltar ao menu anterior");
			opcao = s.nextInt();
			s.nextLine();
		}
	}	
}	
