package projeto;

import java.util.Scanner;

public class Sala implements ExibirDados {

    private int capacidade;
    private String id;
    private boolean ocupada = false;
    private Turma turma;

    public Sala() {
        System.out.println("CRIANDO CLASSE DE SALA");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o identificador da sala:");
        this.id = scan.nextLine();
        System.out.println("Digite a capacidade total da sala:");
        this.capacidade = scan.nextInt();
    }

    public Sala(String id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }

    public Sala(int capacidade, String id, boolean ocupada, Turma turma) {
        System.out.println("Classe de sala criada");
        this.capacidade = capacidade;
        this.id = id;
        this.turma = turma;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public void exibir_dados() {
        try {
            System.out.println("INFORMAÇÕES DA SALA");
            System.out.println("Capcidade máxima: " + this.capacidade);
            System.out.println("Identificação: " + this.id);
            System.out.println("Está sendo ocupada? " + this.ocupada);
            System.out.println("Turma presente na sala: " + this.turma.getId() + "\n");
        } catch (Exception e) {
            System.out.println("Erro ao exibir dados da sala: " + e.getMessage());
        }
    }

    public void verificar_sala() {
        if (this.ocupada == true) {
            System.out.println("A sala " + this.id + " se encontra ocupada no momento pela turma " + this.turma.getId() + ".\n");
        } else {
            System.out.println("A sala " + this.id + " se encontra livre no momento.\n");
        }
    }

    public void ocupar_sala(Turma turma) {
        if (this.ocupada == true) {
            System.out.println("A sala " + this.id + " se encontra ocupada no momento pela turma " + this.turma.getId() + ".\n");
        } else {
            this.turma = turma;
            System.out.println("A sala " + this.id + " foi ocupada pela turma " + this.turma.getId() + ".\n");
            this.ocupada = true;
        }
    }

}
