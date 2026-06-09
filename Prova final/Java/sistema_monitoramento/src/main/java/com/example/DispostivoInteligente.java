package com.example;

public class DispostivoInteligente {

    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private String tipo;
    private boolean ligado;
    private double consumoAtual;
    private double consumoMensal;

    // construtores
    public DispostivoInteligente(int id, String nome, String marca, String modelo, String tipo, boolean ligado, double consumoAtual, double consumoMensal) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ligado = ligado;
        this.consumoAtual = consumoAtual;
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
        public void setConsumoAtual(double consumoAtual) { this.consumoAtual = consumoAtual; }
        public double getConsumoMensal() { return this.consumoMensal; }
        public void setConsumoMensal(double consumoMensal) { this.consumoMensal = consumoMensal; }

    // metodos
        public void enviarDados() {
            // Implementação para enviar dados do dispositivo inteligente
            System.out.println("Enviando dados do dispositivo inteligente: " + this.nome);
        }

        public double obterConsumo() {
            // Implementação para obter consumo do dispositivo inteligente
            System.out.println("Obtendo consumo do dispositivo inteligente: " + this.nome);
            return this.consumoAtual; // Retornar o consumo atual do dispositivo inteligente
        }
}
