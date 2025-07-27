package application;

import controller.*;
import entity.*;
import repository.*;
import service.*;
import utils.FormatarNotaUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AlunoController alunoController = alunoController();
        ProfessorController professorController = professorController();
        DisciplinaController disciplinaController = disciplinaController();
        PeriodoLetivoController periodoLetivoController = periodoLetivoController();
        AlunoDisciplinaController alunoDisciplinaController = alunoDisciplinaController();

        alunoController.cadastrarAluno("Alex", "01234", "alex@alex.com", "2025");
        alunoController.cadastrarAluno("Bruna", "56789", "bruna@exemplo.com", "2024");

        professorController.adicionar("Carlos", "Matemática");
        professorController.adicionar("Fernanda", "História");

        disciplinaController.adicionar("Matemática");
        disciplinaController.adicionar("História");

        periodoLetivoController.adicionar("2025/1");
        periodoLetivoController.adicionar("2025/2");

        Aluno alex = alunoController.exibirAluno(1);
        Aluno bruna = alunoController.exibirAluno(2);

        Disciplina matematica = disciplinaController.exibir(1);
        Disciplina historia = disciplinaController.exibir(2);

        Map<Integer, Double> notasAlex = new HashMap<>();
        notasAlex.put(1, 8.5);
        notasAlex.put(2, 9.0);
        alunoDisciplinaController.adicionar(alex, matematica, notasAlex);

        Map<Integer, Double> notasBruna = new HashMap<>();
        notasBruna.put(1, 5.0);
        notasBruna.put(2, 4.5);
        alunoDisciplinaController.adicionar(bruna, historia, notasBruna);


        System.out.println("\n--- Alunos ---");
        List<Aluno> alunos = alunoController.listarAlunos();
        for (Aluno a : alunos) {
            a.exibirInformacoes();
        }

        System.out.println("\n--- Professores ---");
        List<Professor> professores = professorController.listar();
        for (Professor p : professores) {
            System.out.println(p.getNome() + " - " + p.getFormacao());
        }

        System.out.println("\n--- Disciplinas ---");
        List<Disciplina> disciplinas = disciplinaController.listar();
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome());
        }

        System.out.println("\n--- Períodos Letivos ---");
        List<PeriodoLetivo> periodos = periodoLetivoController.listar();
        for (PeriodoLetivo pl : periodos) {
            System.out.println(pl.getAnoLetivo());
        }

        System.out.println("\n--- Aluno x Disciplina ---");
        List<AlunoDisciplina> associacoes = alunoDisciplinaController.listar();
        for (AlunoDisciplina ad : associacoes) {
            System.out.println("Aluno: " + ad.getAluno().getNome() +
                    " | Disciplina: " + ad.getDisciplina().getNome() +
                    " | Notas: " +  FormatarNotaUtil.formatarNotas(ad.getNotas()) +
                    " | Status: " + alunoDisciplinaController.consultarAprovacao(ad));
        }
    }

    public static AlunoController alunoController() {
        AlunoRepository repo = new AlunoRepository();
        AlunoService service = new AlunoService(repo);
        return new AlunoController(service);
    }

    public static ProfessorController professorController() {
        ProfessorRepository repo = new ProfessorRepository();
        ProfessorService service = new ProfessorService(repo);
        return new ProfessorController(service);
    }

    public static DisciplinaController disciplinaController() {
        DisciplinaRepository repo = new DisciplinaRepository();
        DisciplinaService service = new DisciplinaService(repo);
        return new DisciplinaController(service);
    }

    public static PeriodoLetivoController periodoLetivoController() {
        PeriodoLetivoRepository repo = new PeriodoLetivoRepository();
        PeriodoLetivoService service = new PeriodoLetivoService(repo);
        return new PeriodoLetivoController(service);
    }

    public static AlunoDisciplinaController alunoDisciplinaController() {
        AlunoDisciplinaRepository repo = new AlunoDisciplinaRepository();
        AlunoDisciplinaService service = new AlunoDisciplinaService(repo);
        return new AlunoDisciplinaController(service);
    }
}
