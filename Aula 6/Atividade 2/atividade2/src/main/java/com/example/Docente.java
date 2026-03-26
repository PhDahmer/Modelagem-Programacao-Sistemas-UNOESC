package com.example;

public class Docente extends Funcionario {

    private String titulacao;
    private int nivel;

    private static final int NIVEL_1 = 1;
    private static final int NIVEL_2 = 2;
    private static final int NIVEL_3 = 3;

// construtor

        public Docente(String nome, double valorHora, double horasTrabalhadas, String titulacao, int nivel) {
            super(nome, valorHora, horasTrabalhadas);
            this.titulacao = titulacao;
            this.nivel = nivel;
        }

        public Docente() {
        super("", 0.0, 0.0);
        }

// Getters e Setters

        public String getTitulacao() {
            return titulacao;
        }

        public void setTitulacao(String titulacao) {
            this.titulacao = titulacao;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }   

@Override
    public double calcularSalario(){
        double salarioBase = getValorHora() * getHorasTrabalhadas();
        double fator = 1.0;
        

        switch (getNivel()) {
            case NIVEL_1:
                fator = 1.00; // Base para nível 1 (sem aumento)
                break;
            case NIVEL_2:
                fator = 1.25; // 25% de aumento para nível 2
                break;
            case NIVEL_3:
                fator = 1.50; // 50% de aumento para nível 3
                break;
            default:
                fator = 1.0; // Sem aumento para outros níveis
        }

        return salarioBase * fator;

    }
}
