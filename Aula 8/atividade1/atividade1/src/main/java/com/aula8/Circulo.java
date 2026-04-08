package com.aula8;

public class Circulo implements Geometria {
    private double raio;
    private double area;

    //setters

        public void setRaio(double raio) {
            this.raio = raio;
        }

    //getters

        public double getRaio() {
            return raio;
        }

    //construtor

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea() {
        this.area = PI * Math.pow(raio, 2);
        return area;
    }

}
