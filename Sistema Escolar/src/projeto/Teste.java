package projeto;

public class Teste {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina matematica = new Disciplina();
        matematica.setNome("Matemática");

        Disciplina portugues = new Disciplina();
        portugues.setNome("Português");

        // Criando professores
        ProfessorOficial pro1 = new ProfessorOficial();
        pro1.setNome("Poliana");
        pro1.setAnosInstituicao(5);
        pro1.setCpf("123.456.789-00");
        pro1.setFormacao(matematica);
        pro1.setSalario(5000.0);

        ProfessorSubstituto pro2 = new ProfessorSubstituto();
        pro2.setNome("João Roberto");
        pro2.setDataFimContrato("31/12/2026");
        pro2.setCpf("987.654.321-00");
        pro2.setFormacao(portugues);
        pro2.setSalario(5000.0);

        // Associando professores às disciplinas
        matematica.setProfessor(pro1);
        portugues.setProfessor(pro2);

        // Criando alunos
        AlunoTecnico alunoA = new AlunoTecnico();
        alunoA.setNome("Astolfo");
        alunoA.setCursoTecnico("Informática");
        alunoA.setCpf("111.222.333-44");
        alunoA.setNascimento("01/01/2000");

        AlunoSuperior alunoB = new AlunoSuperior();
        alunoB.setNome("Jeremias");
        alunoB.setCursoSuperior("Engenharia");
        alunoB.setPeriodo(5);
        alunoB.setCpf("555.666.777-88");
        alunoB.setNascimento("02/02/2000");

        // Criando turmas
        Turma turma1 = new Turma();
        turma1.setId("1° Info A");
        turma1.setDisciplina(matematica);
        turma1.setProfessor(pro1);
        turma1.adicionar_aluno(alunoA);
        turma1.adicionar_aluno(alunoB);

        Turma turma2 = new Turma();
        turma2.setId("2° Info E");
        turma2.setDisciplina(portugues);
        turma2.setProfessor(pro2);
        turma2.adicionar_aluno(alunoA);
        turma2.adicionar_aluno(alunoB);

        // Associando turmas aos professores
        pro1.adicionar_turma(turma1);
        pro2.adicionar_turma(turma2);

        // Criando salas
        Sala sala1 = new Sala();
        sala1.setCapacidade(30);
        sala1.setId("Sala 1");

        Sala sala2 = new Sala();
        sala2.setCapacidade(25);
        sala2.setId("Sala 2");

        // Ocupando salas com turmas
        sala1.ocupar_sala(turma1);
        sala2.ocupar_sala(turma2);

        // Criando avaliações separadas para cada aluno
        // Avaliações de Matemática
        Avaliacao avMatematicaA = pro1.criar_prova("Prova 1 de Matemática", "20/05/2025", turma1, pro1, matematica);
        Avaliacao avMatematicaB = pro1.criar_prova("Prova 1 de Matemática", "20/05/2025", turma1, pro1, matematica);

        // Avaliações de História
        Avaliacao avHistoriaA = pro2.criar_prova("Prova 1 de História", "21/05/2025", turma2, pro2, portugues);
        Avaliacao avHistoriaB = pro2.criar_prova("Prova 1 de História", "21/05/2025", turma2, pro2, portugues);

        // Corrigindo provas para Aluno A
        pro1.corrigir_prova(avMatematicaA, alunoA, 8.0);
        pro2.corrigir_prova(avHistoriaA, alunoA, 9.0);

        // Corrigindo provas para Aluno B
        pro1.corrigir_prova(avMatematicaB, alunoB, 7.5);
        pro2.corrigir_prova(avHistoriaB, alunoB, 8.5);

        // Calculando a média dos alunos
        alunoA.calcular_media();
        alunoB.calcular_media();
        
        // Criando a escola
        Escola escola = new Escola();
        escola.setNome("Escola Exemplo");
        escola.setLocalizacao("Cidade, Estado");
        escola.adicionar_aluno(alunoA);
        escola.adicionar_aluno(alunoB);
        escola.adicionar_professor(pro1);
        escola.adicionar_professor(pro2);
        escola.adicionar_disciplina(matematica);
        escola.adicionar_disciplina(portugues);
        escola.adicionar_turma(turma1);
        escola.adicionar_turma(turma2);
        escola.adicionar_sala(sala1);
        escola.adicionar_sala(sala2);

        // Matriculando alunos nas turmas e na escola
        alunoA.matricular(turma1, escola);
        alunoA.matricular(turma2, escola);
        alunoB.matricular(turma1, escola);
        alunoB.matricular(turma2, escola);

        // Exibindo os dados
        escola.exibir_dados();
        alunoA.exibir_dados();
        alunoB.exibir_dados();
        pro1.exibir_dados();
        pro2.exibir_dados();
        matematica.exibir_dados();
        portugues.exibir_dados();
        turma1.exibir_dados();
        turma2.exibir_dados();
        sala1.exibir_dados();
        sala2.exibir_dados();
        avMatematicaA.exibir_dados();
        avHistoriaB.exibir_dados();
    }
}