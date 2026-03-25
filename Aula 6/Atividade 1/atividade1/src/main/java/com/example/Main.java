package com.example;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);
        System.out.println(ingresso);

        IngressoVIP ingressoVIP = new IngressoVIP(50, 20);
        System.out.println(ingressoVIP);

    }
}