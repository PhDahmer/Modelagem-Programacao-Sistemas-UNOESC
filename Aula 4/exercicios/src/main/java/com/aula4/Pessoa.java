package com.aula4;

public class Pessoa {
    private String nome;
    private int idade;

    //getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }   

    //setters
    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public void setIdade(int pIdade){
        this.idade = pIdade;
    }

    // construtor
    public Pessoa(String pNome, int pIdade) {
        this.nome = pNome;
        this.idade = pIdade;
    }

    //construtor vazio
    public Pessoa(){ 

    }

    // métodos
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}