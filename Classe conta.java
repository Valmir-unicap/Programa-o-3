package unikit;
/*
 * @author valmir
 */
public class conta implements Comparable <conta>{//falta implementar a comparação
    private String login;
    private String nome;
    private String senha;
    private String confirmaSenha;
    
    public conta(String login, String nome, String senha, String confirmaSenha){//Construtor
        this.login= login;
        this.nome= nome;
        this.senha= senha;
        this.confirmaSenha= confirmaSenha;
        
    }
    public void setLogin(String login){
        this.login= login;
}
    public String getLogin(){
        return this.login;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSenha(String senha){
        this.senha= senha;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setConfirmarSenha(String confirmarSenha){
        this.confirmaSenha= confirmarSenha;
    }
    public String getConfirmarSenha(){
        return this.confirmaSenha;  
    }
    public String toString(){
        return " O email: "+this.login +" do usuário "+ this.nome+ " da senha: "+this.senha;
    }
    @Override
    public int compareTo(conta C) {//comparação de login.
        return this.login.compareTo(C.login);
    }
}
