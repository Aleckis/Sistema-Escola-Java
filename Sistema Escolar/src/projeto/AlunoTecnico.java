package projeto;

public class AlunoTecnico extends Aluno {
    private String cursoTecnico;

    public AlunoTecnico() {
        super();
        System.out.println("Aluno Técnico criado");
    }

    public String getCursoTecnico() {
        return cursoTecnico;
    }

    public void setCursoTecnico(String cursoTecnico) {
        this.cursoTecnico = cursoTecnico;
    }

    @Override
    public void exibir_dados() {
        super.exibir_dados();
        System.out.println("Curso Técnico: " + this.cursoTecnico+"\n");
    }
}