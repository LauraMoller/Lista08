/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author molle
 */
public class Professor {
    private String nome, email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao) {
        setNome(nome);
        setEmail(email);
        setTitulacao(titulacao);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            throw new IllegalArgumentException ("Não foi informado o nome do professor");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isBlank()){
            throw new IllegalArgumentException ("Não foi informado um email válido");
        }
        this.email = email;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        if(titulacao == null){
            throw new IllegalArgumentException ("Titulação não informada");
        }
        this.titulacao = titulacao;
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor (String nome, String email, Titulacao titulacao) {
        setNome(nome);
        setEmail(email);
        setTitulacao(titulacao);
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        if (titulacao == null) {
            throw new IllegalArgumentException("Titulação não pode estar em branco");
        }
        this.titulacao = titulacao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
         if (email.isBlank()) {
            throw new IllegalArgumentException("E-mail não pode ser vazio");
        }
        this.email = email;
    }    
*/
}
