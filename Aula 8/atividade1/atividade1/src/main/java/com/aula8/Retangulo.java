package com.aula8;

import java.util.Scanner;

public class Retangulo implements Geometria {
    private double base;
    private double altura;
    private double area;

    //setters
        public void setBase(double base) { this.base = base;}

        public void setAltura(double altura) { this.altura = altura;}

    //getters
        public double getBase() { return this.base; }

        public double getAltura() { return this.altura;}

    //construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }
    
    @Override
    public double calcularArea() {
        this.area = base * altura;
        return this.area;
    }

    public void lerDados(Scanner sc) {
        System.out.print("\nDigite a base do retângulo: ");
        this.base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        this.altura = sc.nextDouble();
    }

}
