package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DispostivoInteligente {

    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private String tipo;
    private boolean ligado;
    private double consumoAtual;
    private double consumoMensal;
    private List<LeitraConsumo> leituras = new ArrayList<>();

    // construtores
    public DispostivoInteligente(int id, String nome, String marca, String modelo, String tipo, boolean ligado, double consumoAtual, double consumoMensal, List<LeitraConsumo> leituras) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ligado = ligado;
        this.consumoAtual = consumoAtual;
        this.consumoMensal = consumoMensal;
        this.leituras = leituras;
    }

    public DispostivoInteligente(int id, String nome, String marca, String modelo, String tipo, boolean ligado, double consumoAtual, double consumoMensal) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ligado = ligado;
        this.setConsumoAtual(consumoAtual);
        this.consumoMensal = consumoMensal;

    }

    public DispostivoInteligente() {
    }

    // Getters e Setters
        public int getId() { return this.id; }
        public void setId(int id) { this.id = id; }
        public String getNome() { return this.nome; }
        public void setNome(String nome) { this.nome = nome; }
        public String getMarca() { return this.marca; }
        public void setMarca(String marca) { this.marca = marca; }
        public String getModelo() { return this.modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }
        public String getTipo() { return this.tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
        public boolean isLigado() { return this.ligado; }
        public void setLigado(boolean ligado) { this.ligado = ligado; }
        public double getConsumoAtual() { return this.consumoAtual; }
        
        // Adicionando validação para consumo negativo (Try / Catch)
        public void setConsumoAtual(double consumoAtual) {
            try {
                if (consumoAtual < 0) {
                    throw new IllegalArgumentException("Consumo não pode ser negativo: " + consumoAtual);
                }
                this.consumoAtual = consumoAtual;
            }  catch (IllegalArgumentException e) {
                System.out.println("Erro ao definir consumo: " + e.getMessage());
                this.consumoAtual = 0;
            }
        }   

        public double getConsumoMensal() { return this.consumoMensal; }
        public void setConsumoMensal(double consumoMensal) { this.consumoMensal = consumoMensal; }
        public List<LeitraConsumo> getLeituras() { return this.leituras; }
        public void setLeituras(List<LeitraConsumo> leituras) { this.leituras = leituras; }

    // metodos
        
    public void enviarDados() {
        System.out.println("Enviando dados do dispositivo inteligente: " + this.nome);
        LeitraConsumo leitura = new LeitraConsumo(this.leituras.size() + 1, new Date(), this.consumoAtual);
        leitura.registrarLeitura();
        this.leituras.add(leitura);
    }

    public double obterConsumo() {
        System.out.println("Obtendo consumo do dispositivo inteligente: " + this.nome);
        return this.consumoAtual;
    }
}
