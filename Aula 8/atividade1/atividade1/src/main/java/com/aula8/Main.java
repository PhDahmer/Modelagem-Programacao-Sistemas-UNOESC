package com.aula8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o número para cadastrar o seguinte formato geométrico:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Círculo");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        Geometria geometria = null;

        switch (opcao) {
            case 1:
                
                System.out.print("\nDigite a base do retângulo: ");
                double base = sc.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = sc.nextDouble();
                geometria = new Retangulo(base, altura); 
                break;

            case 2:
                
                System.out.print("\nDigite o lado do quadrado: ");
                double lado = sc.nextDouble();
                geometria = new Quadrado(lado);
                break;

            case 3:
                System.out.print("\nDigite o raio do círculo: ");
                double raio = sc.nextDouble();
                
                break;

            default:
                System.out.println("\nOpção inválida.");
        }

        if (geometria != null) {
            System.out.println("\nA área do formato geométrico é: " + geometria.calcularArea());
        }

        sc.close();
    }
}