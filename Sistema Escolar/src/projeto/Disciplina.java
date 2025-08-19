package projeto;
import java.util.Scanner; 

public class Disciplina {
    private String nome;
    private Professor professor;
    
    public Disciplina(){
        System.out.println("CRIANDO CLASSE DE DISCIPLINA");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da disciplina:");
        this.nome = scan.nextLine();
    }
    
    public Disciplina(String nome){
        this.nome = nome;
    }
    
    public Disciplina(String nome, Professor professor) {
        System.out.println("Classe disciplina criada");
        this.nome = nome;
        this.professor = professor;
    }
    
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
        try{
        System.out.println("INFORMAÇÕES DA DISCIPLINA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Professor: "+this.professor.getNome()+"\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados da disciplina: " + e.getMessage());
        }
    }
    
}