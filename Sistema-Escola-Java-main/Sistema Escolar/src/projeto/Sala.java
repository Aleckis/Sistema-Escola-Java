package projeto;

public class Sala {
    int capacidade;
    String id;
    boolean ocupada = false;
    Turma turma;
    
    
    void verificar_sala(){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.id+".");
        }else{
            System.out.println("Esta sala se encontra livre no momento");
        }
    } 

    void ocupar_sala(Turma turma){
        if(this.ocupada == true){
            System.out.println("Esta sala se encontra ocupada no momento pela turma "+this.turma.id+".");
        }else{
            this.turma = turma;
            System.out.println("Esta sala foi ocupada pela turma "+this.turma.id+".");
            this.ocupada = true;
        }
    }

}


