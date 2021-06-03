package unikit;
/*
     Equipe:
   @author André
   @author Lucas
   @author Pedro
   @author Valmir
 */

//Observação: A Thread é acionada, quando o usuário adiciona um novo amigo.

public class FazOutrasCoisas extends Thread{
    
    @Override
    public void run(){
        int i;
        for(i=1;i>0;i=i-1){
            System.out.println("Thread paralela em execução");
        }
    }  
}
