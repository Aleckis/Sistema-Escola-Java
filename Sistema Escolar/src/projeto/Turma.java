package projeto;

public class Turma {
    private String id;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno aluno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public void exibir_dados(){
        System.out.println("INFORMAÇÕES DA TURMA");
        System.out.println("Indentificação: "+this.id);
        System.out.println("Alunos: "+this.aluno.getNome());
        System.out.println("Professor da turma: "+this.professor.getNome());
        System.out.println("Disciplina: "+this.disciplina.getNome()+"\n");
    }
    
}
