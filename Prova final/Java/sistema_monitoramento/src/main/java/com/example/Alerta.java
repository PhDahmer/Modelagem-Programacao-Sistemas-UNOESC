package com.example;

public class Alerta {
    private int id;
    private double limiteConsumo;
    private boolean aitvo;

    // construtores
    public Alerta(int id, double limiteConsumo, boolean ativo) {
        this.id = id;
        this.limiteConsumo = limiteConsumo;
        this.aitvo = ativo;
        }

    public Alerta() {
    }

    // Getters e Setters

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }
    public double getLimiteConsumo() { return this.limiteConsumo; }
    public void setLimiteConsumo(double limiteConsumo) { this.limiteConsumo = limiteConsumo; }
    public boolean isAtivo() { return this.aitvo; }
    public void setAtivo(boolean ativo) { this.aitvo = ativo; }

    // metodos

    public boolean verificarConsumo(double consumoAtual) {
        return consumoAtual > this.limiteConsumo;
    }
    
}
