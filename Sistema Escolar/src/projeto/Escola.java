package projeto;

public class Escola {
    String localizacao, nome;
    Aluno aluno;
    Professor professor;
    Disciplina disciplina;
    Turma turma;
    Sala sala;
    
    void exibir_dados(){
        System.out.println("INFORMAÇÕES DA ESCOLA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Localização: "+this.localizacao);
        System.out.println("Alunos: "+this.aluno.nome);
        System.out.println("Professores: "+this.professor.nome);
        System.out.println("Diciplina: "+this.disciplina.nome);
        System.out.println("Turmas: "+this.turma.id);
        System.out.println("Salas: "+this.sala.id+"\n");
    }
}