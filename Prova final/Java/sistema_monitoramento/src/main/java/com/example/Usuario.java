package com.example;

public class Usuario  {
    private int id;
    private String nome;
    private String user;
    private String senhaHash;

// contrutores
    public Usuario(int id, String nome, String user, String senhaHash) {
        this.id = id;
        this.nome = nome;
        this.user = user;
        this.senhaHash = senhaHash;
    }

    public Usuario() {
    }

// Getters e Setters
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getNome() { return this.nome; } 

    public void setNome(String nome) { this.nome = nome; }

    public String getUser() { return this.user; }

    public void setUser(String user) { this.user = user; }

    public String getSenhaHash() { return this.senhaHash; }

    public void setSenhaHash(String senhaHash) { this.senhaHash = senhaHash; }

// metodos
    public void atualizarPerfil(String nome, String user, String senhaHash) {
        this.nome = nome;
        this.user = user;
        this.senhaHash = senhaHash;
    }

}
