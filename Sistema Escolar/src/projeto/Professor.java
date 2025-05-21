package projeto;
import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String nome, cpf;
    private double salario;
    private Disciplina formacao;
    private List<Turma> turmas = new ArrayList<>();
    
    public Professor(){
        System.out.println("Classe de professor criada");
    }
    public Professor(String nome, String cpf, double salario, Disciplina formacao) {
        System.out.println("Classe de professor criada");
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.formacao = formacao;
    }
    public List<Turma> getTurmas(){
        return turmas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Disciplina getFormacao() {
        return formacao;
    }

    public void setFormacao(Disciplina formacao) {
        this.formacao = formacao;
    }
    
    public void adicionar_turma(Turma turma){
        if (!turmas.contains(turma)) {
            turmas.add(turma);
            turma.setProfessor(this);
        }
    }
    
    public void remover_turma(Turma turma) {
        if (turmas.contains(turma)) {
            turmas.remove((turma));
            turma.setProfessor(null);
        }
    }
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DO PROFESSOR");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Formação: "+this.formacao.getNome());
        System.out.println("Salário: R$"+this.salario);
        System.out.printf("Turmas: ");
        turmas.forEach((t) -> {
            System.out.printf(t.getId() + ",");
        });
        System.out.println("\n");
    }
    
    public void aumentar_salario(double aumento) {
        this.salario = (aumento /100 + 1) * this.salario; 
        
        System.out.println("O salário do professor "+this.nome+" foi alterado para R$"+this.salario+".\n");
    }
    
    public Avaliacao criar_prova(String des, String data,Turma t,Professor p,Disciplina d) {
        Avaliacao prova = new Avaliacao(); 
        prova.setDescricao(des);
        prova.setData(data);
        prova.setTurma(t);
        prova.setProfessor(p);
        prova.setDisciplina(d);
        
        return prova;
    }
    
    public void corrigir_prova(Avaliacao prova, Aluno aluno, double nota) {
        prova.setAluno(aluno);
        prova.setNota(nota);
        aluno.adicionar_prova(prova);
        System.out.println("O aluno "+aluno.getNome()+" obteve a nota "+nota+" na avaliação: "+prova.getDescricao()+".\n");
    }
}