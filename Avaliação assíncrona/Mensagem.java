package unikit;
public class Mensagem {
    private String para;
    private String de;
    private String mensagem;
    
    public Mensagem(String para, String de, String mensagem) {//Contrutor 1
        super();
        this.para = para;
        this.de = de;
        this.mensagem = mensagem;
    }
    public String getPara() {
        return para;
    }
    public void setPara(String para) {
        this.para = para;
    }
    public String getDe() {
        return de;
    }
    public void setDe(String de) {
        this.de = de;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
