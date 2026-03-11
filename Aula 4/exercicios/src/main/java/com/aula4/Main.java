package com.aula4;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setIdade(19);
        p1.setNome("Pedro");

        p1.exibirInfo();

        Pessoa p2 = new Pessoa("Mari", 17);
        p2.exibirInfo();
    }
}