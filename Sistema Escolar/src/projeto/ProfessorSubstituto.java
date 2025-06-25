package projeto;

public class ProfessorSubstituto extends Professor {
    private String dataFimContrato;

    public ProfessorSubstituto() {
        super();
        System.out.println("Professor Substituto criado");
    }

    public String getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    @Override
    public void exibir_dados() {
        super.exibir_dados();
        System.out.println("Tipo: Substituto");
        System.out.println("Fim do Contrato: " + this.dataFimContrato+"\n");
    }
}