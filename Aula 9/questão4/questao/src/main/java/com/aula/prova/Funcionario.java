package com.aula.prova;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    // contrutores
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
    }

    // getters
    public String getNome() { return this.nome;}
    public double getSalarioBase() { return this.salarioBase;}

    // setters
    public void setNome(String nome) { this.nome = nome;}
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase;}

    // métodos
    public double adicionarBonus(double valor) {
        return this.salarioBase + valor;
    }
}
