package unikit;
/*
      Equipe:
   @author André
   @author Lucas
   @author Pedro
   @author Valmir
 */

//Observação: A Thread é acionada, quando o usuário adiciona um novo amigo. 

public class FazCoisas implements Runnable{
    
    @Override
    public void run(){
        int i;
        for(i=0;i<1;i=i+1){
            System.out.println("Executando a Thread!");//exibi o conteudo a ser chamado na classe unikut
        }
    }
}
