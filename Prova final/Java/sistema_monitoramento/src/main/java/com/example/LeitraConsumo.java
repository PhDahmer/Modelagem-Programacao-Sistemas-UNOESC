package com.example;

import java.util.Date;

public class LeitraConsumo {
    private int id;
    private Date dataHora;
    private double valor;

    // construtores
    public LeitraConsumo(int id, Date dataHora, double valor) {
        this.id = id;
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public LeitraConsumo() {
    }

    // Getters e Setters
        public int getId() { return this.id; }
        public void setId(int id) { this.id = id; }
        public Date getDataHora() { return this.dataHora; }
        public void setDataHora(Date dataHora) { this.dataHora = dataHora; }
        public double getValor() { return this.valor; }
        public void setValor(double valor) { this.valor = valor; }

    // metodos
        public void registrarLeitura() {
            // Implementação para registrar leitura de consumo
            System.out.println("Registrando leitura de consumo: " + this.valor + " kWh em " + this.dataHora);
        }

}

    
