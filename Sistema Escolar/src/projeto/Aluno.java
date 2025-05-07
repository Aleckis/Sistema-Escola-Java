package projeto;

public class Aluno {
    private String nome, matricula, cpf, nascimento;
    private double nota_media;
    private Turma turma_atual;
    private Escola escola;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public Turma getTurma_atual() {
        return turma_atual;
    }

    public void setTurma_atual(Turma turma_atual) {
        this.turma_atual = turma_atual;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
    
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DO ALUNO");
        System.out.println("Nome: "+this.nome);
        System.out.println("Matrícula: "+this.matricula);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Data de nascimento: "+this.nascimento);
        System.out.println("Turma: "+this.turma_atual.getId());
        System.out.println("Nota: "+this.nota_media);
        System.out.println("Escola: "+this.escola.getNome()+"\n");
    }
    
    public void matricular(String matricula, Turma turma, Escola escola) {
        this.matricula = matricula;
        this.turma_atual = turma;
        this.escola = escola;
        
        System.out.println("O aluno "+this.nome+" foi matriculado na turma "+this.turma_atual.getId()+" da escola "+this.escola.getNome()+" com sucesso.\n");
    }
      
    public double calcular_media(Avaliacao av1, Avaliacao av2, Avaliacao av3) {
        double media = (av1.getNota() + av2.getNota() + av3.getNota()) / 3;
        this.nota_media = media;
                
        return media;
    }
}
