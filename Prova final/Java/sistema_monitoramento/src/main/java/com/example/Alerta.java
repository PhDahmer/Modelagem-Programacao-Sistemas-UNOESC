package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alerta {
    private int id;
    private double limiteConsumo;
    private boolean aitvo;
    private List<Notificacao> notificacoes = new ArrayList<>();

    // construtores
    public Alerta(int id, double limiteConsumo, boolean ativo, List<Notificacao> notificacoes) {
        this.id = id;
        this.limiteConsumo = limiteConsumo;
        this.aitvo = ativo;
        this.notificacoes = notificacoes;
    }

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
    public List<Notificacao> getNotificacoes() { return this.notificacoes; }
    public void setNotificacoes(List<Notificacao> notificacoes) { this.notificacoes = notificacoes; }

    // metodos

    public boolean verificarConsumo(double consumoAtual) {
        if (this.aitvo && consumoAtual > this.limiteConsumo) {
            dispararAlerta();
            return true;
        }
        return false;
    }

    private void dispararAlerta() {
        Notificacao n = new Notificacao(
            "Alerta! Consumo (" + this.limiteConsumo + " kWh) excedido.",
            new Date()
        );
        this.notificacoes.add(n);
        n.enviar();
    }
}

