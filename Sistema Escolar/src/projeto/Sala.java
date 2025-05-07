package projeto;

public class Sala {
    private int capacidade;
    private String id;
    private boolean ocupada = false;
    private Turma turma;

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
    
    public void exibir_dados() {
        System.out.println("INFORMAÇÕES DA SALA");
        System.out.println("Capcidade máxima: "+this.capacidade);
        System.out.println("Identificação: "+this.id);
        System.out.println("Está sendo ocupada? "+this.ocupada);
        System.out.println("Turma presente na sala: "+this.turma.getId()+"\n");
    }
    
    public void verificar_sala(){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.getId()+".\n");
        }else{
            System.out.println("Esta sala se encontra livre no momento.\n");
        }
    } 

    public void ocupar_sala(Turma turma){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.getId()+".\n");
        }else{
            this.turma = turma;
            System.out.println("Esta sala foi ocupada pela turma "+this.turma.getId()+".\n");
            this.ocupada = true;
        }
    }

}


