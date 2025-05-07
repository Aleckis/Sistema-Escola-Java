package projeto;

public class Professor {
    private String nome, cpf;
    private double salario;
    private Disciplina formacao;

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
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DO PROFESSOR");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Formação: "+this.formacao.getNome());
        System.out.println("Salário: R$"+this.salario+"\n");
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
}