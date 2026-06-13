package com.example;

import java.util.List;
import java.util.ArrayList;

public class Apartamento extends Predio {
    
    private int andar;
    private int numero;
    private int id;
    private List<DispostivoInteligente> dispositivos = new ArrayList<>();

    // construtores
        public Apartamento(int id, String nome, String endereco, int andar, int numero, List<DispostivoInteligente> dispositivosInteligentes)
        {
            super(id, nome, endereco);
            this.andar = andar;
            this.numero = numero;
            this.dispositivos = dispositivosInteligentes;
        }

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
        public List<DispostivoInteligente> getDispositivos() { return this.dispositivos; }
        public void setDispositivos(List<DispostivoInteligente> dispositivos) { this.dispositivos = dispositivos; }

    // metodos

    public List<DispostivoInteligente> listarDispositivos() {
        System.out.println("Listando dispositivos inteligentes do apartamento: " + this.numero);
        return this.dispositivos;
    }

    // novo metodo
    public void adicionarDispositivo(DispostivoInteligente dispositivo) {
        this.dispositivos.add(dispositivo);
    }
}

