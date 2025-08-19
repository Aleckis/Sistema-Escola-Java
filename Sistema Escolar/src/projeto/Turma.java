package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma implements ExibirDados {

    private String id;
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma() {
        System.out.println("CRIANDO CLASSE DE TURMA");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a identificação da turma:");
        this.id = scan.nextLine();
    }

    public Turma(String id) {
        this.id = id;
    }

    public Turma(String id, Professor professor, Disciplina disciplina, Aluno aluno) {
        System.out.println("Classe de turma criada");
        this.id = id;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

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

    public void adicionar_aluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            aluno.adicionar_turma(this);
        }
    }

    public void remover_aluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.remove(aluno);
            aluno.remover_turma(this);
        }
    }

    public void exibir_dados() {
        try {
            System.out.println("INFORMAÇÕES DA TURMA");
            System.out.println("Indentificação: " + this.id);
            alunos.forEach((a) -> {
                System.out.print(a.getNome() + ", ");
            });
            System.out.println("Professor da turma: " + this.professor.getNome());
            System.out.println("Disciplina: " + this.disciplina.getNome() + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados da turma: " + e.getMessage());
        }
    }

}
