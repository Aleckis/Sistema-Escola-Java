package projeto;

public class Aluno {
    String nome, matricula, cpf, nascimento;
    double nota_media;
    Turma turma_atual;
    Escola escola;
    
    void exibir_dados() {
        System.out.println("INFORMAÇÕES DO ALUNO");
        System.out.println("Nome: "+this.nome);
        System.out.println("Matrícula: "+this.matricula);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Data de nascimento: "+this.nascimento);
        System.out.println("Turma: "+this.turma_atual.id);
        System.out.println("Nota: "+this.nota_media);
        System.out.println("Escola: "+this.escola.nome+"\n");
    }
    
    void matricular(String matricula, Turma turma, Escola escola) {
        this.matricula = matricula;
        this.turma_atual = turma;
        this.escola = escola;
        
        System.out.println("O aluno "+this.nome+" foi matriculado na turma "+this.turma_atual.id+" da escola "+this.escola.nome+" com sucesso.\n");
    }
      
    double calcular_media(Avaliacao av1, Avaliacao av2, Avaliacao av3) {
        double media = (av1.nota + av2.nota + av3.nota) / 3;
        this.nota_media = media;
                
        return media;
    }
}
