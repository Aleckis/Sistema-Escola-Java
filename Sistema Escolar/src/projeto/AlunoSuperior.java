package projeto;

import java.util.Scanner;

public class AlunoSuperior extends Aluno {

    private String cursoSuperior;
    private int periodo;

    public AlunoSuperior() {
        super();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o curso do aluno: ");
        this.cursoSuperior = scan.nextLine();
        System.out.println("Digite o periodo do aluno: ");
        this.periodo = scan.nextInt();
    }

    public AlunoSuperior(String cpf, String nome, String nascimento, String curso, int periodo) {
        super(cpf, nome, nascimento);
        this.cursoSuperior = curso;
        this.periodo = periodo;
    }

    public String getCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(String cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void exibir_dados() {
        try {
            super.exibir_dados();
            System.out.println("Curso Superior: " + this.cursoSuperior);
            System.out.println("Período: " + this.periodo + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados do aluno superior: " + e.getMessage());
        }
    }

}
