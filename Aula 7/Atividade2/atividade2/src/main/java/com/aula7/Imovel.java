package com.aula7;

abstract public class Imovel {
    private String endereco;
    private float valor;  

    //getters e setters
    public String getEndereco() { return this.endereco; }
    public float getValor() { return this.valor; }


    public void setEndereco(String e) { this.endereco = e; }
    public void setValor(float v) { this.valor = v; }
    

    //constructors
    public Imovel() { }
    public Imovel(String endereco, float valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    //metodo abstrato
    public abstract float calcularValorFinal();
}