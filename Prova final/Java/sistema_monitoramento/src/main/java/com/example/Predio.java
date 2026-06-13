package com.example;

import java.util.ArrayList;
import java.util.List;

public class Predio {
    private int id;
    private String nome;
    private String endereco;
    private List<Apartamento> apartamentos = new ArrayList<>();

    // construtores
    public Predio(int id, String nome, String endereco, List<Apartamento> apartamentos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = apartamentos;
    }

    public Predio(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Predio() {
    }

    // Getters e Setters
        public int getId() { return this.id; }
        public void setId(int id) { this.id = id; }
        public String getNome() { return this.nome; }
        public void setNome(String nome) { this.nome = nome; }
        public String getEndereco() { return this.endereco; }
        public void setEndereco(String endereco) { this.endereco = endereco; }
        public List<Apartamento> getApartamentos() { return this.apartamentos; }
        public void setApartamentos(List<Apartamento> apartamentos) { this.apartamentos = apartamentos; }

    // metodos

    public void listarApartamentos() {
        System.out.println("Listando apartamentos do prédio: " + this.nome);
        for (Apartamento a : this.apartamentos) {
            System.out.println(" - Apto " + a.getNumero() + " (andar " + a.getAndar() + ")");
        }
    }

    public void adicionarApartamento(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
        System.out.println("Adicionando apartamento ao prédio: " + this.nome);
    }

    public void removerApartamento(Apartamento apartamento) {
        this.apartamentos.remove(apartamento);
        System.out.println("Removendo apartamento do prédio: " + this.nome);
    }

}
