package com.aula8;

import java.util.Scanner;

public class Circulo implements Geometria {
    private double raio;
    private double area;

    //setters

        public void setRaio(double raio) {
            this.raio = raio;
        }

    //getters

        public double getRaio() {
            return this.raio;
        }

    //construtor

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea() {
        this.area = PI * Math.pow(this.raio, 2);
        return this.area;
    }

    public void lerDados(Scanner sc) {
        System.out.print("\nDigite o raio do círculo: ");
        this.raio = sc.nextDouble();
    }

}
