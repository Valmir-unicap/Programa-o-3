package p3lista1;
/*
 * @author valmir
 */
public class Marvel implements Comparable <Marvel>{
    private String numeroIdentificacao;
    private String nome;
    private String poder;
    private int ano;
    private boolean situacao;
    
    public Marvel(String numeroidentificacao, String nome, String poder, int ano, boolean situacao){
        this.numeroIdentificacao= numeroidentificacao;
        this.nome= nome;
        this.poder= poder;
        this.ano= ano;
        this.situacao= situacao;
        }
        public void setnumeroidentificacao(String numeroidentificacao){
          this.numeroIdentificacao= numeroidentificacao;   
        }
        public String getnumeroidentificacao(){
            return this.numeroIdentificacao;
        }
        public void setnome(String nome){
            this.nome= nome;
        }
        public String getnome(){
            return this.nome;
        }
        public void setpdoer(String poder){
            this.poder= poder;
        }
        public String getpoder(){
            return this.poder;
        }
        public void setano(int ano){
            this.ano= ano;
        }
        public int getano(){
            return this.ano;
        }
        public void setsituacao(boolean situacao){
            this.situacao= situacao;
        }
        public boolean getsituacao(){
            return this.situacao;
        }
    public String toString(){
        return " Codigo de identificacão: "+ this.numeroIdentificacao +" nome do personagem: "+this.nome+" poder pricipal: "+this.poder+" ano de criação: "+ this.ano+" foi morto pelo o thanos: "+this.situacao;
    }
    
    @Override
    public int compareTo(Marvel M) {
    return this.numeroIdentificacao.compareTo(M.numeroIdentificacao);
    } 
    
}
