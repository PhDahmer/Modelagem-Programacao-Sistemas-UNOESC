package com.example;

public class IngressoVIP extends Ingresso {
    private float valorAdicional;

    // setters
    public void setValorAdicional(float pValorAdicional) {
        this.valorAdicional = pValorAdicional;
    }

    // getters
    public float getValorAdicional(){
        return this.valorAdicional;
    }

    // construtor
    public IngressoVIP (float pPreco, float pValorAdicional) {
        super(pPreco);
        this.valorAdicional = pValorAdicional;
    }

    public IngressoVIP() {

    }

    // métodos
    @Override
    public String toString() {
        return "Valor do ingresso VIP: " + (super.getPreco() + this.valorAdicional);
    }
}
