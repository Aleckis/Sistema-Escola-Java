package projeto;

public class Avaliacao {
    private String descricao, data;
    private double nota;
    private Turma turma;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno aluno;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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
    
    
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DO AVALIAÇÃO");
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Data de aplicação: "+this.data);
        System.out.println("Disciplina: "+this.disciplina.getNome());
        System.out.println("Professor: "+this.professor.getNome());
        System.out.println("Turma: "+this.turma.getId());
        System.out.println("Aluno: "+this.aluno.getNome());
        System.out.println("Nota: "+this.nota+"\n");
    }
    
    public void atribuir_nota(double nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
        
        System.out.println("O aluno "+this.aluno.getNome()+" obteve a nota "+this.nota+" na avaliação: "+this.descricao+".\n");
    }
}
