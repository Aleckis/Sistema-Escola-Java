package projeto;

public class Disciplina {
    private String nome;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        
        System.out.println("O professor "+this.professor.getNome()+" foi designado para a disciplina "+this.nome+".\n");
    }
    
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DA DISCIPLINA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Professor: "+this.professor.getNome()+"\n");
    }
    
}