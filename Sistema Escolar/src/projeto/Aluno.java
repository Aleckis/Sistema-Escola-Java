package projeto;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome, cpf, nascimento;
    private int matricula;
    private static int proxid = 1;
    private double nota_media;
    private List<Turma> turmas = new ArrayList<>();
    private List<Avaliacao> provas = new ArrayList<>();
    private Escola escola;
    private double somaTotal = 0;
  

    public Aluno() {
        System.out.println("Classe Aluno criada");
        this.matricula = proxid++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public void adicionar_turma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
        }
    }

    public void remover_turma(Turma turma) {
        turmas.remove(turma);
    }
    
    public void adicionar_prova(Avaliacao prova) {
        if (!provas.contains(prova)) {
            provas.add(prova);
        }
    }
    
    public void remover_prova(Avaliacao prova) {
        provas.remove(prova);
    }

    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DO ALUNO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de nascimento: " + this.nascimento);
        System.out.print("Turmas: ");
        turmas.forEach((t) -> {
            System.out.print(t.getId() + ", ");
        });
        System.out.println("\nNota: " + this.nota_media);
        System.out.println("Escola: " + this.escola.getNome() + "\n");
    }

    public void matricular(Turma turma, Escola escola) {
        this.matricula = proxid++;
        adicionar_turma(turma);
        this.escola = escola;
        System.out.println("O aluno " + this.nome + " foi matriculado na turma " + turma.getId() + " da escola " + this.escola.getNome() + " com sucesso.\n");
    }

    public double calcular_media() {
        provas.forEach((p) -> {
            somaTotal += p.getNota();
        });
        double media = somaTotal / provas.size();
        this.nota_media = media;
        return media;
    }
}