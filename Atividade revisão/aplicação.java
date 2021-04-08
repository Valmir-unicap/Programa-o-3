/*

Observação: Um vilão pode ter o mesmo código de heroi, pois são de classes diferentes.
Falta: checap de banco de armazenamento, para vilões e heróis antigos da marvel antes do ultimato.
*/
package p3lista1;
/*
 * @author valmir
 */
import java.util.Scanner;
public class universoMarvel {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Mundo Marvel");
        System.out.println("");
        int tam1;//definindo o tamanho da quantidade de herois que devera armazenar.
        System.out.print("Digite a quantidade de herois, a ser inserida: ");
        tam1= in.nextInt();
        while(tam1<0){//validando a entrada de dados para tamanho hérois.
            System.out.print("Inválido, digite novamente: ");
            tam1= in.nextInt();
        }
        Heroi universoMarvelHeroi;//puxo da minha classe heroi
        universoMarvelHeroi= new Heroi(tam1);//Passei o tamanho de herois para armazenar
        
        int tam2;//definindo o tamanho da quantidade de vilões que devera armazenar.
        System.out.print("Digite a quantidade de vilões, a ser inserida: ");
        tam2= in.nextInt();
        while(tam2<0){//validando a entrada de dados para tamanho vilões.
            System.out.print("Inválido, digite novamente: ");
            tam2= in.nextInt();
        }
        Vilao universoMarvelVilao;//puxo da minha classe viloes
        universoMarvelVilao= new Vilao(tam2);//Passei a quantidade de vilões que devera armazenar.
        
        Marvel M;//puxo da minha classe marvel
        int escolha, ano;
        String nome, codigo, poderes;
        boolean situa;
        do{
        System.out.println("Menu:");
        System.out.println("");
        System.out.println("1- Inclusão de personagem");
        System.out.println("2- Consultar personagem");
        System.out.println("3- Excluir personagem");
        System.out.println("4- Listar todos os personagem");
        System.out.println("5- Listar por classe de personagens");
        System.out.println("6- Listar personagem que sobreviveram ao estalo do Thanos");
        System.out.println("0- Sair");
        System.out.println("");
        System.out.print("Escolha uma das opções acima: ");
        escolha= in.nextInt();
        while(escolha>6 && escolha<0){//validando para que o usuário escolha a opção de 0 à 6
            System.out.println("Inválido, digite novamente: ");
            escolha= in.nextInt();
        }
        switch(escolha){
            case 1:
                int num;
                System.out.println("Esse personagem é: 1- heroi ou 2- vilão?");
                System.out.print("Escolha uma das opções acima: ");
                num= in.nextInt();
                while(num>2 || num<1){//Validando! Só é inválido se for maior que 2 e menor que 1, 
                    System.out.print("Inválido, digite novamente:");
                    num= in.nextInt();
                }
                
                if(num==1){//Heroi
                System.out.println("");
                System.out.print("Digite o código do personagem: ");
                in.nextLine();//evitar erro
                codigo= in.nextLine();
                System.out.print("Digite o nome do personagem: ");
                nome= in.nextLine();
                System.out.print("Digite qual é o poder desse personagem: ");
                poderes= in.nextLine();
                System.out.print("Digite o ano de criação desse personagem: ");
                ano= in.nextInt();
                System.out.print("Foi morto pelo o Thanhos? ");
                situa= in.nextBoolean();
                M= new Marvel(codigo,nome,poderes,ano,situa);
                System.out.println("Exibir: "+M);
                universoMarvelHeroi.CadastroHeroi(M);
                
                }else{//Vilão
                        System.out.println("");
                        System.out.print("Digite o código do personagem: ");
                        in.nextLine();//evitar erro
                        codigo= in.nextLine();
                        System.out.print("Digite o nome do personagem: ");
                        nome= in.nextLine();
                        System.out.print("Digite qual é o poder desse personagem: ");
                        poderes= in.nextLine();
                        System.out.print("Digite o ano de criação desse personagem: ");
                        ano= in.nextInt();
                        M= new Marvel(codigo,nome,poderes,ano,false);//false pois Thanos não matou nenhum vilão. OBS: Loki pode ser heroi
                        System.out.println("Exibir: "+M);
                        universoMarvelVilao.CadastroVilao(M);
                    }
                break;
                
            case 2: 
                System.out.println("");
                //in.nextLine();
                int opcao1;
                System.out.println("Esse personagem é: 1- heroi ou 2- vilão?");
                System.out.print("Escolha uma das opções acima: ");
                opcao1= in.nextInt();
                while(opcao1>2 || opcao1<1){//Validando! Só é inválido se for maior que 2 e menor que 1, 
                    System.out.print("Inválido, digite novamente:");
                    opcao1= in.nextInt();
                }
                System.out.println("");
                in.nextLine();
                System.out.println("Digite o código do personegem: ");
                codigo= in.nextLine();
                if(opcao1==1){
                universoMarvelHeroi.consultarHeroi(codigo);
                }else{
                universoMarvelVilao.consultarVilao(codigo);
                }
                break;
                
            case 3:
                System.out.println("");
                //in.nextLine();
                int opcao2;
                System.out.println("Esse personagem é: 1- heroi ou 2- vilão?");
                System.out.print("Escolha uma das opções acima: ");
                opcao2= in.nextInt();
                while(opcao2>2 || opcao2<1){//Validando! Só é inválido se for maior que 2 e menor que 1, 
                    System.out.print("Inválido, digite novamente:");
                    opcao2= in.nextInt();
                }
                System.out.println("");
                in.nextLine();
                System.out.println("Digite o código do personegem: ");
                codigo= in.nextLine(); 
                universoMarvelHeroi.removerHeroi(codigo);
                universoMarvelVilao.removerVilao(codigo);
                break;
                
            case 4:
                System.out.println("");
                System.out.println("Personagens cadastrados");
                universoMarvelHeroi.exibirHeroi();
                universoMarvelVilao.exibirVilao();
                break;
                
            case 5:
                System.out.println("");
                int numero;
                System.out.println("Esse personagem é: 1- heroi ou 2- vilão?");
                System.out.print("Escolha: ");
                numero= in.nextInt();
                while(numero>2 || numero<1){//validando para que a entrada de dados seja 2 ou 1.
                    System.out.print("Inválido, digite novamente:");
                    numero= in.nextInt();
                }
                if(numero==1){
                    universoMarvelHeroi.exibirHeroi();
                }else{
                    universoMarvelVilao.exibirVilao();
                }
                break;
                
            case 6:
                //não fiz
                break;
                
            case 0:
                System.out.println("Você escolheu sair.");
                break;
                
            default:
                System.out.println("Opção inválida, digite novamente");
                
        }
        }while(escolha!=0);
    }
}
