package projeto;
import java.util.Scanner;

public class Avaliacao implements ExibirDados{
    private String descricao, data;
    private double nota;
    private Turma turma;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno aluno;
    
    public Avaliacao(){
        System.out.println("CRIANDO AVALIAÇÃO");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma descrição para a prova:");
        this.descricao = scan.nextLine();
        System.out.println("Digite a data de aplicação da prova");
        this.data = scan.nextLine();
    }
    public Avaliacao(String descricao, String data){
        this.descricao = descricao;
        this.data = data;
    }
    public Avaliacao(String descricao, String data, double nota, Turma turma, Professor professor, Disciplina disciplina, Aluno aluno) {
        System.out.println("Classe de Avaliação criada");
        this.descricao = descricao;
        this.data = data;
        this.nota = nota;
        this.turma = turma;
        this.professor = professor;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }
    

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
    
}
