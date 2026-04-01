package com.aula7;

public class ImovelNovo extends Imovel {
    private float valorAdicional;

    // getters e setters
    public float getValorAdicional() { return this.valorAdicional; }
    public void setValorAdicional(float v) { this.valorAdicional = v; }

    // constructors
    public ImovelNovo() { }

    public ImovelNovo(String endereco, float valor, float valorAdicional) {
        super(endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    // 🔥 método importante
    @Override
    public float calcularValorFinal() {
        return getValor() + valorAdicional;
    }
}