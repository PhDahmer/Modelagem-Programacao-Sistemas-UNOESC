package com.example;

public class SindicoC extends MoradorC implements Login {

    // construtores
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
        // fazer codigo apos definir como os prédios são gerenciados
        System.out.println("Gerenciando prédios para " + this.getNome());
        }

    public void gerenciarMoradores() {
        // fazer codigo apos definir como os moradores são gerenciados
        System.out.println("Gerenciando moradores para " + this.getNome());
    }   

    public void gerenciarApartamentos() {
        // fazer codigo apos definir como os apartamentos são gerenciados
        System.out.println("Gerenciando apartamentos para " + this.getNome());
    }

    public void consultarConsumoGeral() {
        // fazer codigo apos definir como o consumo geral é consultado
        System.out.println("Consultando consumo geral para " + this.getNome());
    }


}
