package projeto;

public class Teste {
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.capacidade = 50;
        sala.id = "Sala 102";
        
        sala.verificar_sala();
        
        Disciplina geo = new Disciplina();
        geo.nome = "Geografia";
        
        Professor pro1 = new Professor();
        pro1.nome = "Marciel";
        pro1.cpf = "123.634.123-64";
        pro1.formacao = geo;
        pro1.salario = 5000;
        
        pro1.aumentar_salario(20);
        
        geo.atribuir_professor(pro1);

        Aluno a1 = new Aluno();
        a1.nome = "Astolfo";
        a1.cpf = "432.863.235-92";
        a1.nascimento = "18/06/2006";
        
        Turma turma = new Turma();
        turma.id = "1° - A";
        turma.aluno = a1;
        turma.disciplina = geo;
        turma.professor = pro1;

        sala.ocupar_sala(turma);
       
        Avaliacao av1 = pro1.criar_prova("Prova de Geografia", "01/04/2025", turma, pro1, geo);
        Avaliacao av2 = pro1.criar_prova("Prova de Geografia 2", "07/05/2025", turma, pro1, geo);
        Avaliacao av3 = pro1.criar_prova("Prova de Geografia 3", "12/06/2025", turma, pro1, geo);
        
        av1.atribuir_nota(5.9, a1);
        av2.atribuir_nota(8.6, a1);
        av3.atribuir_nota(7.1, a1);
        
        a1.calcular_media(av1, av2, av3);
        
        Escola escola = new Escola();
        escola.nome = "Colégio Chess";
        escola.localizacao = "Centro, Machado, MG";
        escola.aluno = a1;
        escola.disciplina = geo;
        escola.professor = pro1;
        escola.sala = sala;
        escola.turma = turma;
        
        a1.matricular("001", turma, escola);
        
        escola.exibir_dados();
        a1.exibir_dados();
        pro1.exibir_dados();
        geo.exibir_dados();
        turma.exibir_dados();
        sala.exibir_dados();
        av1.exibir_dados();
    }
}
