package projeto;

public class Sala {
    int capacidade;
    String id;
    boolean ocupada = false;
    Turma turma;
    
    void exibir_dados() {
        System.out.println("INFORMAÇÕES DA SALA");
        System.out.println("Capcidade máxima: "+this.capacidade);
        System.out.println("Identificação: "+this.id);
        System.out.println("Está sendo ocupada? "+this.ocupada);
        System.out.println("Turma presente na sala: "+this.turma.id+"\n");
    }
    
    void verificar_sala(){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.id+".\n");
        }else{
            System.out.println("Esta sala se encontra livre no momento.\n");
        }
    } 

    void ocupar_sala(Turma turma){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.id+".\n");
        }else{
            this.turma = turma;
            System.out.println("Esta sala foi ocupada pela turma "+this.turma.id+".\n");
            this.ocupada = true;
        }
    }

}


