package com.aula8;

public class Circulo implements Geometria {
    private float raio;
    private float area;

    //setters

        public void setRaio(float raio) {
            this.raio = raio;
        }

    //getters

        public float getRaio() {
            return raio;
        }

    //construtor

    public Circulo(float raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public float calcularArea() {
        this.area = pi * raio * raio;
        return area;
    }

}
