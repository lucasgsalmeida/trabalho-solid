package me.lucas.srp.antes;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void salvarNoBanco() {
        System.out.println("Salvando pessoa no banco de dados.");
    }

    public String formatarNomeEmail() {
        return this.nome + " - " + this.email;
    }
}

