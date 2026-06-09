package com.example;

import java.util.List;

public class Apartamento extends Predio {
    
    private int andar;
    private int numero;
    private int id;

    // construtores
        public Apartamento(int id, String nome, String endereco, int andar, int numero)
        {
            super(id, nome, endereco);
            this.andar = andar;
            this.numero = numero;
        }

        public Apartamento() {
        }

    // Getters e Setters

        public int getAndar() { return this.andar; }
        public void setAndar(int andar) { this.andar = andar; }
        public int getNumero() { return this.numero; }
        public void setNumero(int numero) { this.numero = numero; }
        public int getId() { return this.id; }
        public void setId(int id) { this.id = id; } 

    // metodos

    public List <DispostivoInteligente> listarDispositivos() {
        // Implementação para listar dispositivos inteligentes do apartamento
        System.out.println("Listando dispositivos inteligentes do apartamento: " + this.numero);
        return null; // Retornar a lista de dispositivos inteligentes
    }
}
