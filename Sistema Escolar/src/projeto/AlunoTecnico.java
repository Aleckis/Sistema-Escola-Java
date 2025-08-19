package projeto;

import java.util.Scanner;

public class AlunoTecnico extends Aluno {

    private String cursoTecnico;

    public AlunoTecnico() {
        super();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o curso do aluno: ");
        this.cursoTecnico = scan.nextLine();
    }

    public AlunoTecnico(String cpf, String nome, String nascimento, String curso) {
        super(cpf, nome, nascimento);
        this.cursoTecnico = curso;
    }

    public String getCursoTecnico() {
        return cursoTecnico;
    }

    public void setCursoTecnico(String cursoTecnico) {
        this.cursoTecnico = cursoTecnico;
    }

    @Override
    public void exibir_dados() {
        try {
            super.exibir_dados();
            System.out.println("Curso Técnico: " + this.cursoTecnico + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados do aluno tecnico: " + e.getMessage());
        }
    }
}
