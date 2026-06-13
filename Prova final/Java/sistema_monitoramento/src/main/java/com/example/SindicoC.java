package com.example;

import java.util.List;

public class SindicoC extends MoradorC implements Login {

    // construtores
    public SindicoC(int id, String nome, String user, String senhaHash, Predio predio, Apartamento apartamento, List<Alerta> alertas) {
        super(id, nome, user, senhaHash, predio, apartamento, alertas);
    }

    public SindicoC(int id, String nome, String user, String senhaHash, Predio predio, Apartamento apartamento) {
        super(id, nome, user, senhaHash, predio, apartamento);
    }

    public SindicoC() {
    }

    // Metodos Interface Login
    @Override
    public boolean autenticar(String user, String senha) {
        // Implementação da autenticação
        return this.getUser().equals(user) && this.getSenhaHash().equals(senha);
    }

    @Override
    public void logout() {
        // Implementação do logout
        System.out.println("Síndico " + this.getUser() + " deslogado.");
    }

    // Outros métodos específicos de SindicoC
    public void gerenciarPredios() {
        System.out.println("Gerenciando prédios para " + this.getNome());
        this.getPredio().listarApartamentos();
    }

    public void gerenciarMoradores() {
        System.out.println("Gerenciando moradores para " + this.getNome());
        // OBS: o sistema atual não possui uma lista de moradores em Predio/SindicoC.
        // Conforme estrutura existente, fica apenas o registro do acesso.
    }

    public void gerenciarApartamentos() {
        System.out.println("Gerenciando apartamentos para " + this.getNome());
        for (Apartamento a : this.getPredio().getApartamentos()) {
            System.out.println(" - Apto " + a.getNumero() + " (andar " + a.getAndar() + ")");
        }
    }

    public void consultarConsumoGeral() {
        System.out.println("Consultando consumo geral para " + this.getNome());
        double total = 0;
        for (Apartamento a : this.getPredio().getApartamentos()) {
            for (DispostivoInteligente d : a.listarDispositivos()) {
                total += d.obterConsumo();
            }
        }
        System.out.println("Consumo total do prédio: " + total + " kWh");
    }
}



