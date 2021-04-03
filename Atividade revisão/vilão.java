package p3lista1;
/*
 * @author valmir
 */
public class Vilao {
    private int contador;
    private Marvel[]armazenar;
    
    public Vilao(int tamanho){//pedir para o usuário digitar o tamanho, é bem melhor.
        armazenar= new Marvel[tamanho]; 
    }
    
    public int buscaSimples(Marvel M){
        int i;
        if(this.contador==0){
        return -2;//vetor vázio
    }else{
          for(i=0;i<this.contador;i=i+1){
              if(this.armazenar[i].compareTo(M)==0){
                  return i;//achou
              }
          }
          return -1;//não achou
        }
    }
        public void CadastroVilao(Marvel M){
        if(this.contador<this.armazenar.length){
            int pos;
            pos= buscaSimples(M);
            if(pos==-1 || pos==-2){
                this.armazenar[this.contador]=M;
                this.contador++;
                System.out.println("Inserção realizada!");
        }else{
                System.out.println("Personagem repetido! Inserção não realizada!");
        }
    }else{
            System.out.println("Cadastro cheio! Inserção não realizada!");
        }
    }
            public void exibirVilao(){
            int i;
            if(this.contador==0){
            System.out.println("Cadastro vázio!");
        }else{
            for(i=0;i<armazenar.length;i=i+1){
                System.out.println("Vilões cadastrados");
                System.out.println(this.armazenar[i]);
                }
            }
        }
            public void removerVilao (String codigo) {
                int pos, i;        
                pos = this.buscaBinaria(codigo);
                if (pos == -1) {
                    System.out.println("Vilão não encontrado!");
                }else {
                    for (i = pos; i < this.contador; i++) {
                        this.armazenar[i] = this.armazenar[i+1];
                    }
                    this.contador--;
                    System.out.println("Vilão removido!");
                }
            }
                public int buscaBinaria (String codigo){
                    int inicio = 0, fim = this.contador-1, meio;
                    if (this.contador == 0) {
                        return -1;
                    }else {
                        Marvel M = new Marvel (codigo, "","",0,false);
                    do {
                        meio = (inicio + fim) / 2;
                        if (M.compareTo (this.armazenar[meio]) == 0) {
                            return meio;
                        }else if (M.compareTo(this.armazenar[meio]) < 0) {
                            fim = meio - 1;
                        }else {
                            inicio = meio + 1;   
                        }
                    } while (inicio <= fim);
                    return -1;
                 }       
            }
                public void consultarVilao(String codigo){
                    int i;
                    if(this.contador!=0){
                        i= this.buscaBinaria(codigo);
                        if(i==-1){
                            System.out.println("Personagem não cadastrado");
                        }else{
                            System.out.println("Personagem:");
                            System.out.println(this.armazenar[i]);
                        }
                    }else{
                        System.out.println("Cadastro vázio! ");
                    }
                }
}
