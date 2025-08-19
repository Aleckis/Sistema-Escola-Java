package projeto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Escola implements ExibirDados {

    private String localizacao, nome;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();
    private List<Sala> salas = new ArrayList<>();

    public Escola() {
        System.out.println("CRIANDO CLASSE DE ESCOLA");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da escola:");
        this.nome = scan.nextLine();
        System.out.println("Digite a localização da escola:");
        this.localizacao = scan.nextLine();
    }

    public Escola(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionar_aluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void remover_aluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
        }
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionar_professor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public void remover_professor(Professor professor) {
        if (alunos.contains(professor)) {
            alunos.remove(professor);
        }
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionar_disciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void remover_disciplina(Disciplina disciplina) {
        if (alunos.contains(disciplina)) {
            alunos.remove(disciplina);
        }
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionar_turma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
        }
    }

    public void remover_turma(Turma turma) {
        if (alunos.contains(turma)) {
            alunos.remove(turma);
        }
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void adicionar_sala(Sala sala) {
        if (!salas.contains(sala)) {
            salas.add(sala);
        }
    }

    public void remover_sala(Sala sala) {
        if (alunos.contains(sala)) {
            alunos.remove(sala);
        }
    }

    @Override
    public void exibir_dados() {
        try {
            System.out.println("INFORMAÇÕES DA ESCOLA");
            System.out.println("Nome: " + this.nome);
            System.out.println("Localização: " + this.localizacao);
            System.out.print("Alunos: ");
            alunos.forEach((a) -> {
                System.out.print(a.getNome() + ", ");
            });
            System.out.print("\nProfessores: ");
            professores.forEach((p) -> {
                System.out.print(p.getNome() + ", ");
            });
            System.out.print("\nDisciplinas: ");
            disciplinas.forEach((d) -> {
                System.out.print(d.getNome() + ", ");
            });
            System.out.print("\nTurmas: ");
            turmas.forEach((t) -> {
                System.out.print(t.getId() + ", ");
            });
            System.out.print("\nSalas: ");
            salas.forEach((s) -> {
                System.out.print(s.getId() + ", ");
            });
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados da escola: " + e.getMessage());
        }
    }
}
