package com.aula8;

public class Retangulo implements Geometria {
    private float base;
    private float altura;
    private float area;

    //setters

        public void setBase(float base) {
            this.base = base;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

    //getters

        public float getBase() {
            return base;
        }

        public float getAltura() {
            return altura;
        }

    //construtor

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }
    
    @Override
    public float calcularArea() {
        this.area = base * altura;
        return area;
    }

}
