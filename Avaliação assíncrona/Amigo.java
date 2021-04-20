package unikit;
public class Amigo {
    private String para;
    private String de;
    private boolean pendente;

    public Amigo(String de, String para) {
        this.de = de;
        this.para = para;
        this.pendente = true;
    }
    public String getDe() {
        return de;
    }
    public void setDe(String de){
        this.de=de;
    }
    public String getPara() {
        return para;
    }
    public void setPara(String para){
        this.para=para;
    }
    public void setPendente (boolean pendente) {
        this.pendente = pendente;
    }
    public boolean getPendente () {
        return this.pendente;
    }
}
