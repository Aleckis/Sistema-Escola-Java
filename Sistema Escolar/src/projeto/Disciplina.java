package projeto;

public class Disciplina {
    String nome, cod;
    Professor professor;
    
    void atribuir_professor(Professor professor) {
        this.professor = professor;

        System.out.println("O professor "+this.professor.nome+" foi designado para a disciplina "+this.nome+".");
    }
}