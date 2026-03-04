package com.example;

import java.util.Scanner;

public class Main {
    public static String Saudacao(String nome) {
        return "Olá, " + nome + "! Bem-vindo!.";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome:");
        String nome = scan.next();
        System.out.println(Saudacao(nome));
    }
}
