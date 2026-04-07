package com.aula8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o número para cadastrar o seguinte formato geométrico: \n1 - Retângulo\n2 - Quadrado\n3 - Círculo\n");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Retangulo retangulo = new Retangulo();
                System.out.println("\nDigite a base do retângulo:");
                retangulo.setBase(sc.nextFloat());
                System.out.println("\nDigite a altura do retângulo:");
                retangulo.setAltura(sc.nextFloat());
                System.out.println("\nA área do retângulo é: " + retangulo.calcularArea());
                break;
            case 2:
                Quadrado quadrado = new Quadrado();
                System.out.println("\nDigite o lado do quadrado:");
                quadrado.setBase(sc.nextFloat());
                System.out.println("\nA área do quadrado é: " + quadrado.calcularArea());
                break;
            case 3:
                Circulo circulo = new Circulo();
                System.out.println("\nDigite o raio do círculo:");
                circulo.setRaio(sc.nextFloat());
                System.out.println("\nA área do círculo é: " + circulo.calcularArea());
                break;
            default:
                System.out.println("Opção inválida.");
        }

        


    }
}