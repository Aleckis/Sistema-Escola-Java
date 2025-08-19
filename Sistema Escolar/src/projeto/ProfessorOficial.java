package projeto;

import java.util.Scanner;

public class ProfessorOficial extends Professor {

    private int anosInstituicao;

    public ProfessorOficial() {
        super();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos anos de instituição possui na escola:");
        this.anosInstituicao = scan.nextInt();
    }

    public ProfessorOficial(String nome, String cpf, double salario, int anosInstituicao) {
        super(nome, cpf, salario);
        this.anosInstituicao = anosInstituicao;
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

    public void exibir_dados() {
        try {
            super.exibir_dados();
            System.out.println("Anos na instituição: " + this.anosInstituicao);
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados do professor efetivo: " + e.getMessage());
        }
    }
}
