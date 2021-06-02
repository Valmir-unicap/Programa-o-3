package unikit;
/*
 * @author valmir
 */
public class FazOutrasCoisas extends Thread{
    
    @Override
    public void run(){
        int i;
        for(i=1;i>0;i=i-1){
            System.out.println("Thread continuando a execução");
        }
    }  
}
