package com.aula.prova;

public class Comissionado extends Funcionario implements Pagamento {
    
    private double valorVendas;
    private double percentualComissao;

    // construtores
    public Comissionado(double valorVendas, double percentualComissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public Comissionado(String string, int i, int j) {
    }

    // getters
    public double getValorVendas() { return this.valorVendas;}
    public double getPercentualComissao() { return this.percentualComissao;}

    // setters
    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas;}
    public void setPercentualComissao(double percentualComissao) { this.percentualComissao = percentualComissao;}

    // métodos
    @Override
    public void exibirResumo() {
        System.out.println("Funcionário Comissionado: " + this.getNome());
        System.out.println("Valor das Vendas: R$ " + this.getValorVendas());
        System.out.println("Percentual de Comissão: " + this.getPercentualComissao() + "%");
        System.out.println("Salário Base: R$ " + this.getSalarioBase());
        System.out.println("Pagamento Total: R$ " + this.calcularPagamento());
    }

    @Override
    public double calcularPagamento() {
        return this.getSalarioBase() + 
            (this.valorVendas * (this.percentualComissao / 100));
    }

}

