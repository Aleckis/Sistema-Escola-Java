package projeto;

public class Turma {
    String id;
    Professor professor;
    Sala sala;
    Disciplina disciplina;
    Aluno aluno;
    
    void exibir_dados(){
        System.out.println("INFORMAÇÕES DA TURMA");
        System.out.println("Indentificação: "+this.id);
        System.out.println("Alunos: "+this.aluno.nome);
        System.out.println("Professor da turma: "+this.professor.nome);
        System.out.println("Sala da turma: "+this.sala.id);
        System.out.println("Disciplina: "+this.disciplina.nome+"\n");
    }
    
}
