public class Fisica extends Materia {

    public Fisica(String questao, String resp) {
        super(questao, resp);
    }

    @Override
    public void exibirExplicacao(int random) {
        if (random == 0) {
            System.out.println("A unidade de medida da força no Sistema Internacional é o Newton (N).");
        } else if (random == 1) {
            System.out.println("Isaac Newton foi o responsável por formular a Lei da Gravitação Universal.");
        } else if (random == 2) {
            System.out.println("A velocidade da luz no vácuo é aproximadamente 299.792.458 m/s.");
        }
    }
}
