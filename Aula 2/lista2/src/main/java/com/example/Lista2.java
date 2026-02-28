package com.example;

import java.util.Scanner;

public class Lista2 {

    public static void atividade1() {
        int numero = 1; 
        for (int i = 0; numero <= 100; i ++) {
            System.out.println("nuemero: " + numero);
            numero+=2;
        }
    }

    public static void atividade2() {
        int numero = 0;
        for (int i=0; i <= 5; i++) {
            numero = i * i;
            System.out.println("numero: " + i + " elevado a 2 = " + numero);
        }
    }

    public static void atividade3() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void atividade4() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        for(int i = 0; i <= numero; i++) {
            System.out.println("numero: " + i);    
        }
    }

    public static void atividade5() {
        int numero = 0;
        for (int i = 0; i<=100; i++) {
            numero += i;
        }
        System.out.println("numero: " + numero);
    }
    
    public static void atividade6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100: ");

        int numero = scan.nextInt();

        while (numero < 0 || numero > 100) {
            System.out.println("Numero invalido, digite um numero de 0 a 100: ");
            numero = scan.nextInt();
        }

        for (int i=numero; i <=100; i++) {
            System.out.println("numero: " + i);
        }
    }

    public static void atividade7() { 
        Scanner scan = new Scanner(System.in);
        int escolha;

        System.out.println("=-=-=-=-=-= Banco Ph Banking =-=-=-=-=-=");
        System.out.println("Opção 1: Saque");
        System.out.println("Opção 2: Depósito");
        System.out.println("Opção 3: Saldo");
        System.out.println("Opção 4: Sair");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("\nDigite a opção desejada: ");
        escolha = scan.nextInt();

        while (escolha < 1 || escolha > 4) {
            System.out.print("Numero invalido, digite um numero de 1 a 4: ");
            escolha = scan.nextInt();
        }
        
        // fazer um switch case, para cada opção e apenas digitar algo na tela, nao fazer atividade de banco em si
    }
    
    public static void main(String[] args) {
        atividade7();
    }
}
