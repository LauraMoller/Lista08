/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author lpa
 */
public class Turma {

    private String disciplina;
    private Turno turno;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String disciplina, Turno turno, Professor professor) {
        alunos = new ArrayList<Aluno>();
        this.disciplina = disciplina;
        this.turno = turno;
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina.isBlank()) {
            throw new IllegalArgumentException("Não foi informado um nome válido para disciplina");
        }
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        if (turno == null) {
            throw new IllegalArgumentException("Não foi informado um turno válido");
        }
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Não foi informado um professor válido");
        }
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno a) {
        if (a == null) {
            throw new IllegalArgumentException("Aluno deve ser unformado");
        }
        if (buscar(a.getMatricula(), a.getNome()) != null) {
            throw new IllegalArgumentException("Aluno já cadastrado na lista");
        }
        alunos.add(a);
    }

    private Aluno buscar(int matricula, String nome) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula && a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public void removerAluno(int matricula, String nome) {
        Aluno e = buscar(matricula, nome);
        if (e == null) {
            throw new IllegalArgumentException("Aluno deve ser informado");
        }
        alunos.remove(e);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        double notaEnem = 0;
        Aluno alunoMaior = null;
        for (Aluno a : alunos) {
            if (a.getNotaEnem() > notaEnem) {
                notaEnem = a.getNotaEnem();
                alunoMaior = a;
            }
        }
        return alunoMaior;
    }

    public String listarAlunos() {
        String dados = "";
        for (Aluno a : alunos) {
            dados += a.getNome() + " " + a.getNotaEnem() + "\n";
        }
        return dados;
    }
}