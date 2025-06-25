package projeto;

public class AlunoSuperior extends Aluno {
    private String cursoSuperior;
    private int periodo;

    public AlunoSuperior() {
        super();
        System.out.println("Aluno Superior criado");
    }

    public String getCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(String cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void exibir_dados() {
        super.exibir_dados();
        System.out.println("Curso Superior: " + this.cursoSuperior);
        System.out.println("Período: " + this.periodo+"\n");
    }
}