package com.example;

import java.util.ArrayList;
import java.util.List;

public class MoradorC extends Usuario implements Login {
    
    private Predio predio;
    private Apartamento apartamento;
    private List<Alerta> alertas = new ArrayList<>();

// construtores
    public MoradorC(int id, String nome, String user, String senhaHash, Predio predio, Apartamento apartamento, List<Alerta> alertas) {
        super(id, nome, user, senhaHash);
        this.predio = predio;
        this.apartamento = apartamento;
        this.alertas = alertas;
    }

    public MoradorC(int id, String nome, String user, String senhaHash, Predio predio, Apartamento apartamento) {
        super(id, nome, user, senhaHash);
        this.predio = predio;
        this.apartamento = apartamento;
    }

    public MoradorC() {
    }

// Getters e Setters
    public Predio getPredio() { return this.predio; }
    public void setPredio(Predio predio) { this.predio = predio; }

    public Apartamento getApartamento() { return this.apartamento; }
    public void setApartamento(Apartamento apartamento) { this.apartamento = apartamento; }

// Metodos Interface Login
    @Override
    public boolean autenticar(String user, String senha) {
        // Implementação da autenticação
        return this.getUser().equals(user) && this.getSenhaHash().equals(senha);
    }

    @Override
    public void logout() {
        // Implementação do logout
        System.out.println("Usuário " + this.getUser() + " deslogado.");
    }

// Outros métodos específicos de MoradorC
    
    public void visualizarConsumo() {
        System.out.println("Visualizando consumo para " + this.getNome());
        for (DispostivoInteligente d : this.apartamento.listarDispositivos()) {
            System.out.println(" - " + d.getNome() + ": " + d.obterConsumo() + " kWh");
        }
    }

    public void consultarHistorico() {
        System.out.println("Consultando histórico para " + this.getNome());
        for (DispostivoInteligente d : this.apartamento.listarDispositivos()) {
            for (LeitraConsumo l : d.getLeituras()) {
                System.out.println(" - " + d.getNome() + ": " + l.getValor() + " kWh em " + l.getDataHora());
            }
        }
    }

    public void gerenciarAlerta(Alerta alerta) {
        this.alertas.add(alerta);
        System.out.println("Gerenciando alertas para " + this.getNome());
    }

    public void gerenciarDispositivos(DispostivoInteligente dispositivo) {
        this.apartamento.adicionarDispositivo(dispositivo);
        System.out.println("Gerenciando dispositivos para " + this.getNome());
    }
    
}