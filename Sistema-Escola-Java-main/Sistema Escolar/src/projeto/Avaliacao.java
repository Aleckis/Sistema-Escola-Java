package projeto;

public class Avaliacao {
    String descricao, data;
    double nota;
    Turma turma;
    Professor professor;
    Disciplina disciplina;
    Aluno aluno;
    
    void exibir_dados() {
        System.out.println("INFORMAÇÕES DO AVALIAÇÃO");
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Data de aplicação: "+this.data);
        System.out.println("Disciplina: "+this.disciplina);
        System.out.println("Professor: "+this.professor);
        System.out.println("Turma: "+this.turma);
        System.out.println("Nota: "+this.nota+"\n");
    }
    
    void atribuir_nota(double nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
        
        System.out.println("O aluno "+this.aluno.nome+" obteve a nota "+this.nota+" na avaliação: "+this.descricao+".");
    }
}
