package com.aula7;

public class Assistente extends Funcionario {

    private int matricula;

    // getters
    public int getMatricula() { return this.matricula; }

    // setters
    public void setMatricula(int m) { this.matricula = m; }

    //constructors
    public Assistente() { }

    public Assistente(String nome, Salario salario, int matricula) {
        super.setNome(nome);
        super.setSalario(salario);
        this.matricula = matricula; 
    }

    //metodos
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
    }

}