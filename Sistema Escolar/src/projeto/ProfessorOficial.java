package projeto;

public class ProfessorOficial extends Professor {
    private int anosInstituicao;

    public ProfessorOficial() {
        super();
        System.out.println("Professor Titular criado");
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    @Override
    public void aumentar_salario(double aumento) {
        double bonusAntiguidade = anosInstituicao * 0.05;
        super.aumentar_salario(aumento + bonusAntiguidade);
    }
}