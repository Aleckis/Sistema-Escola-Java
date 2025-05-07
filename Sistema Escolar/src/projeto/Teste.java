package projeto;

public class Teste {
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.setCapacidade(50);
        sala.setId("Sala 102");
        
        sala.verificar_sala();
        
        Disciplina geo = new Disciplina();
        geo.setNome("Geografia");
        
        Professor pro1 = new Professor();
        pro1.setNome("Marciel");
        pro1.setCpf("123.634.123-64");
        pro1.setFormacao(geo);
        pro1.setSalario(5000);
        
        pro1.aumentar_salario(20);
        
        geo.setProfessor(pro1);

        Aluno a1 = new Aluno();
        a1.setNome("Astolfo");
        a1.setCpf("123.123.123.12");
        a1.setNascimento("18-06-2006");
        
        Turma turma = new Turma();
        turma.setId("1° - A");
        turma.setAluno(a1);
        turma.setDisciplina(geo);
        turma.setProfessor(pro1);

        sala.ocupar_sala(turma);
       
        Avaliacao av1 = pro1.criar_prova("Prova de Geografia", "01/04/2025", turma, pro1, geo);
        Avaliacao av2 = pro1.criar_prova("Prova de Geografia 2", "07/05/2025", turma, pro1, geo);
        Avaliacao av3 = pro1.criar_prova("Prova de Geografia 3", "12/06/2025", turma, pro1, geo);
        
        av1.atribuir_nota(5.9, a1);
        av2.atribuir_nota(8.6, a1);
        av3.atribuir_nota(7.1, a1);
        
        a1.calcular_media(av1, av2, av3);
        
        Escola escola = new Escola();
        escola.setNome("Colégio Chess");
        escola.setLocalizacao("Centro, Machado, MG");
        escola.setAluno(a1);
        escola.setDisciplina(geo);
        escola.setProfessor(pro1);
        escola.setSala(sala);
        escola.setTurma(turma);
        
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
