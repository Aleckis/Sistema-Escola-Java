package projeto;

public class Professor {
    String nome, cpf;
    double salario;
    Disciplina formacao;
    
    void exibir_dados() {
        System.out.println("INFORMAÇÕES DO PROFESSOR");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Formação: "+this.formacao.nome);
        System.out.println("Salário: R$"+this.salario+"\n");
    }
    
    void aumentar_salario(double aumento) {
        this.salario = (aumento /100 + 1) * this.salario; 
        
        System.out.println("O salário do professor "+this.nome+" foi alterado para R$"+this.salario+".\n");
    }
    
    Avaliacao criar_prova(String des, String data,Turma t,Professor p,Disciplina d) {
        Avaliacao prova = new Avaliacao(); 
        prova.descricao = des;
        prova.data = data;
        prova.turma = t;
        prova.professor = p;
        prova.disciplina = d;
        
        return prova;
    }
}