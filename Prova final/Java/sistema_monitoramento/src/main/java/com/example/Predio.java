package com.example;

public class Predio {
    private int id;
    private String nome;
    private String endereco;

    // construtores
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

    // metodos

        public void listarApartamentos() {
            // Implementação para listar apartamentos do prédio
            System.out.println("Listando apartamentos do prédio: " + this.nome);
        }   

        public void adicionarApartamento() {
            // Implementação para adicionar apartamento ao prédio
            System.out.println("Adicionando apartamento ao prédio: " + this.nome);
        }

        public void removerApartamento() {
            // Implementação para remover apartamento do prédio
            System.out.println("Removendo apartamento do prédio: " + this.nome);
        }

}
