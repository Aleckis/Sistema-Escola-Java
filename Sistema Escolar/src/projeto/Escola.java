package projeto;

public class Escola {
    private String localizacao, nome;
    private Aluno aluno;
    private Professor professor;
    private Disciplina disciplina;
    private Turma turma;
    private Sala sala;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public void exibir_dados(){
        System.out.println("INFORMAÇÕES DA ESCOLA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Localização: "+this.localizacao);
        System.out.println("Alunos: "+this.aluno.getNome());
        System.out.println("Professores: "+this.professor.getNome());
        System.out.println("Diciplina: "+this.disciplina.getNome());
        System.out.println("Turmas: "+this.turma.getId());
        System.out.println("Salas: "+this.sala.getId()+"\n");
    }
}