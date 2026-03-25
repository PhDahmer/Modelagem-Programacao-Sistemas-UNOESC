package com.example;

public class Ingresso {
    private float preco;

// setters
    public void setPreco(float pPreco) {
        this.preco = pPreco;
    }
//getters
    public float getPreco() {
        return this.preco;
    }

// construtor
    public Ingresso(float pPreco) {
        this.preco = pPreco;
    }

    // construtor vazio
    public Ingresso() {

    }

    // métodos
    public String toString() {
        return "Valor do ingresso: " + this.preco;
    }
}
