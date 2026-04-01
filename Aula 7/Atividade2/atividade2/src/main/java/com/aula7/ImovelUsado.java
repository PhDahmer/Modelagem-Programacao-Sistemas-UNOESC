package com.aula7;

public class ImovelUsado extends Imovel {
    private float valorDesconto;

    // getters e setters
    public float getValorDesconto() { return this.valorDesconto; }
    public void setValorDesconto(float v) { this.valorDesconto = v; }

    // constructors
    public ImovelUsado() { }

    public ImovelUsado(String endereco, float valor, float valorDesconto) {
        super(endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    // 🔥 método essencial
    @Override
    public float calcularValorFinal() {
        return getValor() - valorDesconto;
    }
}