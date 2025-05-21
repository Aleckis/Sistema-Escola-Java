package projeto;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String id;
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos = new ArrayList<>();
    
    public Turma(){
        System.out.println("Classe de turma criada");
    }
    public Turma(String id, Professor professor, Disciplina disciplina, Aluno aluno) {
        System.out.println("Classe de turma criada");
        this.id = id;
        this.professor = professor;
        this.disciplina = disciplina;
    }
    public List<Aluno> getAlunos(){
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
    
    public void remover_aluno(Aluno aluno){
        if(!alunos.contains(aluno)){
            alunos.remove(aluno);
            aluno.remover_turma(this);
        }
    }
    
    public void exibir_dados(){
        System.out.println("INFORMAÇÕES DA TURMA");
        System.out.println("Indentificação: "+this.id);
        alunos.forEach((a) -> {
            System.out.print(a.getNome()+ ", ");
        });
        System.out.println("Professor da turma: "+this.professor.getNome());
        System.out.println("Disciplina: "+this.disciplina.getNome()+"\n");
    }
    
}
