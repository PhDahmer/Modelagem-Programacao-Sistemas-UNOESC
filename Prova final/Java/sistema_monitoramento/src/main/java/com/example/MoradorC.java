package com.example;

public class MoradorC extends Usuario implements Login {
    
    private Predio predio;
    private Apartamento apartamento;

// construtores
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
        // fazer codigo apos definir como o consumo é armazenado e calculado
        System.out.println("Visualizando consumo para " + this.getNome());
    }

    public void consultarHistorico() {
        // fazer codigo apos definir como o histórico é armazenado
        System.out.println("Consultando histórico para " + this.getNome());
    }

    public void gerenciarAlerta() {
        // fazer codigo apos definir como as alertas são gerenciadas
        System.out.println("Gerenciando alertas para " + this.getNome());
    }

    public void gerenciarDispositivos() {
        // fazer codigo apos definir como os dispositivos são gerenciados
        System.out.println("Gerenciando dispositivos para " + this.getNome());
    }
    
}