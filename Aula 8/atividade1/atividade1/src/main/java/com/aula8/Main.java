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
                geometria = new Retangulo(); 
                break;

            case 2:
                geometria = new Quadrado();
                break;

            case 3:
                geometria = new Circulo();
                break;

            default:
                System.out.println("\nOpção inválida.");
        }

        if (geometria != null) {
            geometria.lerDados(sc);
            System.out.println("\nA área do formato geométrico é: " + geometria.calcularArea());
        }

        sc.close();
    }
}