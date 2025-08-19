package projeto;

import java.util.Scanner;

public class ProfessorSubstituto extends Professor {

    private String dataFimContrato;

    public ProfessorSubstituto() {
        super();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a data do fim do contrato");
        this.dataFimContrato = scan.nextLine();
    }

    public ProfessorSubstituto(String nome, String cpf, double salario, String fimcontrato) {
        super(nome, cpf, salario);
        this.dataFimContrato = fimcontrato;   
    }

    public String getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    @Override
    public void exibir_dados() {
        try {
            super.exibir_dados();
            System.out.println("Tipo: Substituto");
            System.out.println("Fim do Contrato: " + this.dataFimContrato + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados do professor substituto: " + e.getMessage());
        }
    }
}
