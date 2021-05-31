package unikit;
/*
 * @author valmito
 */
public class FazCoisas implements Runnable{
    
    @Override
    public void run(){
        int i;
        for(i=0;i<100;i=i+1){
            System.out.println("Executando a Thread!");//exibi o conteudo a ser chamado na classe unikut
        }
    }
    //Que tal exibir um manual da UNIKUT?
    /*public void exibirManual(){// pode fazer um manual
    
    }*/
}
