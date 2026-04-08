package com.aula8;

public class Quadrado implements Geometria {
    private double lado;
    private double area;

    //setters

        public void setLado(double lado) {
            this.lado = lado;
        }



    //getters

        public double getLado() {
            return lado;
        }


    //construtor

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
    }

    @Override
    public double calcularArea() {
        this.area = lado * lado;
        return area;
    }
}
