package com.aula7;

public class Funcionario {
    private String nome;
    private Salario salario;

    // getters
    public String getNome() { return this.nome; }
    public Salario getSalario() { return this.salario; }

    // setters
    public void setNome(String n) { this.nome = n; }
    public void setSalario(Salario s) { this.salario = s; }

    //constructors
    public Funcionario() { }
    public Funcionario(String nome, Salario salario) {
        this.nome = nome;
        this.salario = salario;  
    }

    //metodos

    public void adcionarAumento(double valor) {
        this.salario.setSalarioBruto(this.salario.getSalarioBruto() + valor);
    }

    public void ganhoAnual() {
        double ganhoAnual = this.salario.getSalarioBruto() * 12;
        System.out.println("Ganho anual bruto: " + ganhoAnual);

    }
    
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        salario.calcularTudo();
        salario.exibeSalario();
    }

}
