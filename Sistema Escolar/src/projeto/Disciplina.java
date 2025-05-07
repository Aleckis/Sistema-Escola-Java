package projeto;

public class Disciplina {
    String nome;
    Professor professor;
    
    void exibir_dados() {
        System.out.println("INFORMAÇÕES DA DISCIPLINA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Professor: "+this.professor.nome+"\n");
    }
    
    void atribuir_professor(Professor professor) {
        this.professor = professor;

        System.out.println("O professor "+this.professor.nome+" foi designado para a disciplina "+this.nome+".\n");
    }
}