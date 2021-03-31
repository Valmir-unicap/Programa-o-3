package unikit;
import java.util.Scanner;
/*
 * @author valmir
 */
public class unikut {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        criacaoConta unikut= new criacaoConta();//Pego da classe criacaoConta
        conta C;//Pego da classe conta
        int escolha;
        do{   
            menu();
            System.out.print("escolha uma das opções acima: ");
            escolha= in.nextInt();
            switch (escolha){
                case 1://cria conta

                    break;

                case 2://editar perfil
                    alterar();
                    break;

                case 3://adição de amigos

                    break;

                case 4://envio de recados

                    break;

                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default :
                    System.out.println("Opção inválida!");
                    break;
                }
            }while(escolha!=0);
        }   
   
    public static void menu(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Editar perfil");
        System.out.println("3 - Adição de amigos");
        System.out.println("4 - Envio de recados");
        System.out.println("0 - Sair");
    }
            public static void alterar(){
                Scanner in= new Scanner(System.in);
                conta C;//Pego da classe conta
                int escolhaNova;
                System.out.println("");
                System.out.println("Escolha uma das opções");
                System.out.println("1-Editar nome");
                System.out.println("2-Editar senha");
                System.out.println("0-Sair");
                escolhaNova= in.nextInt();
                String novoNome, novoSenha, novoConfirmar;
                switch (escolhaNova){
                    case 1:
                        //C.getNome();
                        System.out.println("Digite o novo nome: ");
                        novoNome= in.nextLine();
                        C.setNome(novoNome);//Inserido um nome novo
                        break;
                
                    case 2:
                        //C.getSenha();
                        System.out.print("Digite a nova senha: ");
                        novoSenha= in.nextLine();
                        C.setSenha(novoSenha);//foi insirido uma nova senha
                        //C.getConfirmarSenha();//pegar a senha antiga confirmada
                        System.out.print("Digite novamente a nova senha: ");
                        novoConfirmar= in.nextLine();
                        C.setConfirmarSenha(novoConfirmar);//foi insirido uma novaSenhaConfirmada
                        while(!C.getSenha().equals(C.getConfirmarSenha())){//obriga até que seja igual, a nova senha e a nova senha confirmada. 
                           // C.getSenha();
                            System.out.print("Inválido, digite novamente a nova senha: ");
                            novoSenha= in.nextLine();
                            C.setSenha(novoSenha);
                           // C.getConfirmarSenha();
                            System.out.print("Digite novamente a nova senha, para confirmar: ");
                            novoConfirmar= in.nextLine();
                            C.setConfirmarSenha(novoConfirmar);//foi insirido uma novaSenhaConfirmada
                        }
                        break;

                    case 0:
                        System.out.println("Você saiu do método alterar");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                    }
                }
}
/*
    public void alterarConta(){
        Scanner in= new Scanner(System.in);
        int escolha;
        System.out.println("Escolha uma das opções");
        System.out.println("1-Editar nome");
        System.out.println("2-Editar senha");
        System.out.println("0-Sair");
        escolha= in.nextInt();
        String pegaNome, novoNome,pegaSenha, novoSenha, pegaSenhaConfirmada, pegarSenhaAntiga, novaConfirmar;
        switch (escolha){
            case 1:
                pegaNome= getNome();//nome antigo
                System.out.println("Digite o novo nome: ");
                novoNome= in.nextLine();
                setNome(novoNome);//nome novo
                break;
                
            case 2:
                pegaSenha= getSenha();//pegar a senha antiga
                System.out.println("Digite a nova senha: ");
                novoSenha= in.nextLine();
                setSenha(novoSenha);//foi insirido uma nova senha
                pegarSenhaAntiga= getConfirmarSenha();//pegar a senha antiga confirmada
                novaConfirmar= novoSenha;//nova senha confirmada é igual a senha inserida nova
                setConfirmarSenha(novaConfirmar);//foi insirido uma novaSenhaConfirmada
                break;
                
            case 0:
                System.out.println("Você saiu do método alterar");
                break;
                
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
*/
