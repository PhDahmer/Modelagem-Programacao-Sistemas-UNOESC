package com.aula8;

public class Quadrado implements Geometria {
    private float lado;
    private float area;

    //setters

        public void setBase(float base) {
            this.lado = base;
        }



    //getters

        public float getBase() {
            return lado;
        }


    //construtor

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public Quadrado() {
    }

    @Override
    public float calcularArea() {
        this.area = lado * lado;
        return area;
    }
}
