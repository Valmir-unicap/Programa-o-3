package unikit;
/*
 * @author valmir
 */
public class match {
        private String match;
        private String paraMatch;
        private String deMatch;
        
   public match(String paraMatch,String deMatch,String match){//Contrutor
        super();
        this.paraMatch=deMatch;
        this.deMatch=deMatch;
        this.match=match;

    }
    public String getParaMatch() {
        return paraMatch;
    }
    public void setParaMatch(String paraMatch) {
        this.paraMatch = paraMatch;
    }
    public String getDeMatch() {
        return deMatch;
    }
    public void setDeMatch(String deMatch) {
        this.deMatch = deMatch;
    }
    public void setMatch(String match){
        this.match=match;
    }
    public String getMatch(){
        return this.match;
    } 
    
}
