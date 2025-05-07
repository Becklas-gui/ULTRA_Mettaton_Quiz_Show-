public class Matematica extends Materia{

    public Matematica(String questao, String resp){
        super(questao, resp);
    };

    @Override
    public void exibirExplicacao(int random){
        if(random==0){
            System.out.println("Vai tomar no cu");
        }else if(random==1){
            System.out.println("Vai tomar no cu 2");
        }else if(random==2){
            System.out.println("Vai tomar no cu 3");
        }
    };
}
