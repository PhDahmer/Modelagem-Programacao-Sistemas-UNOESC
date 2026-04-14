package com.aula8;

import java.util.Scanner;

public class Quadrado implements Geometria {
    private double lado;
    private double area;


    //setters

        public void setLado(double lado) {
            this.lado = lado;
        }



    //getters

        public double getLado() {
            return this.lado;
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
        return this.area;
    }

    public void lerDados(Scanner sc) {
        System.out.print("\nDigite o lado do quadrado: ");
        this.lado = sc.nextDouble();
    }
    
}
