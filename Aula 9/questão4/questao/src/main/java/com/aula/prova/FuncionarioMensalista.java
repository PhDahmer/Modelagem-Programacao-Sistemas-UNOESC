package com.aula.prova;

public class FuncionarioMensalista extends Funcionario implements Pagamento {

    // construtores
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public FuncionarioMensalista() {
    }

    //métodos
    @Override
    public void exibirResumo() {
        System.out.println("Funcionário Mensalista: " + this.getNome());
        System.out.println("Salário Base: R$ " + this.getSalarioBase());
        System.out.println("Pagamento Total: R$ " + this.calcularPagamento());
    }

    @Override
    public double calcularPagamento() {
        return this.getSalarioBase();
    }
}
