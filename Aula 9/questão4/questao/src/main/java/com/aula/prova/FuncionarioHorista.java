package com.aula.prova;

public class FuncionarioHorista extends Funcionario implements Pagamento {
    
    private double valorHora;
    private double horasTrabalhadas;

    //construtores
    public FuncionarioHorista(double valorHora, double horasTrabalhadas, String nome){ 
        super(nome, 0);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        }

    public FuncionarioHorista() {
    }

    //getters
    public double getValorHora() { return this.valorHora;}
    public double getHorasTrabalhadas() { return this.horasTrabalhadas;}

    //setters
    public void setValorHora(double valorHora) { this.valorHora = valorHora;}
    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas;}

    //métodos
    @Override
    public void exibirResumo() {
        System.out.println("Funcionário Horista: " + this.getNome());
        System.out.println("Valor por Hora: R$ " + this.getValorHora());
        System.out.println("Horas Trabalhadas: " + this.getHorasTrabalhadas());
        System.out.println("Pagamento Total: R$ " + this.calcularPagamento());  
        }

    @Override
    public double calcularPagamento() {
        return this.valorHora * this.horasTrabalhadas;
    }
}

