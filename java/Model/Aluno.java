/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 *
 * @author lpa
 */
public class Aluno {

    private int matricula;
    private String nome;
    private double notaEnem;

    public Aluno(int matricula, String nome, double notaEnem) {
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("A matrícula informada não é válida");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Não foi informado um nome válido para aluno");
        }
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        if (notaEnem < 0 || notaEnem > 1000) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 1000");
        }
        this.notaEnem = notaEnem;
    }
}
