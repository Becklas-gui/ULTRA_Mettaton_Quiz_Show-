public abstract class Materia {
    private String questao;
    private String resp;

    public Materia(String questao, String resp){
        this.questao=questao;
        this.resp=resp;
    };

    public String getquestao(){
        return questao;
    };

    public String getresp(){
        return resp;
    };

    public void setquestao(String questao){
        this.questao = questao;
    };

    public void setrep(String resp){
        this.resp = resp;
    };

    abstract void exibirExplicacao(int random);
}
