package unikit;
/*
 * @author valmir
 */
public class FazCoisas implements Runnable{
    
    @Override
    public void run(){
        int i;
        for(i=0;i<1;i=i+1){
            System.out.println("Executando a Thread!");//exibi o conteudo a ser chamado na classe unikut
        }
    }
}
