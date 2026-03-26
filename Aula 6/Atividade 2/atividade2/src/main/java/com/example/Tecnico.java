package com.example;

public class Tecnico extends Funcionario {

    private String funcao;
    private double horasExtras;

    // construtor
    public Tecnico(String nome, double valorHora, double horasTrabalhadas, String funcao, double horasExtras) {
        super(nome, valorHora, horasTrabalhadas);
        this.funcao = funcao;
        this.horasExtras = horasExtras;
    }

    public Tecnico() {
        super("", 0.0, 0.0);
    }

    // Getters e Setters
        public String getFuncao() {
            return funcao;
        }

        public void setFuncao(String funcao) {
            this.funcao = funcao;
        }  

        public double getHorasExtras() {
            return horasExtras;
        }   

        public void setHorasExtras(double horasExtras) {
            this.horasExtras = horasExtras;
        }

    @Override
    public double calcularSalario() {
        return (getValorHora() * getHorasTrabalhadas()) + (horasExtras * getValorHora() * 1.25);
    }

}
