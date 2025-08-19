package projeto;

public class TesteScan {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina matematica = new Disciplina();
        Disciplina portugues = new Disciplina();

        // Criando professores
        ProfessorOficial pro1 = new ProfessorOficial();
        pro1.setFormacao(matematica);

        ProfessorSubstituto pro2 = new ProfessorSubstituto();
        pro2.setFormacao(portugues);

        // Associando professores às disciplinas
        matematica.setProfessor(pro1);
        portugues.setProfessor(pro2);

        // Criando alunos
        AlunoTecnico alunoA = new AlunoTecnico();        
        AlunoSuperior alunoB = new AlunoSuperior();

        // Criando turmas
        Turma turma1 = new Turma();
        turma1.setDisciplina(matematica);
        turma1.setProfessor(pro1);
        turma1.adicionar_aluno(alunoA);
        turma1.adicionar_aluno(alunoB);

        Turma turma2 = new Turma();
        turma2.setDisciplina(portugues);
        turma2.setProfessor(pro2);
        turma2.adicionar_aluno(alunoA);
        turma2.adicionar_aluno(alunoB);

        // Associando turmas aos professores
        pro1.adicionar_turma(turma1);
        pro2.adicionar_turma(turma2);

        // Criando salas
        Sala sala1 = new Sala();
        Sala sala2 = new Sala();

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