package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Docente docente1 = new Docente("Alice", 50.0, 160, "Doutorado", 3);
        Docente docente2 = new Docente("Charlie", 40.0, 160, "Mestrado", 2);
        Docente docente3 = new Docente("Eve", 30.0, 160, "Graduação", 1);
        Tecnico tecnico1 = new Tecnico("Bob", 30.0, 160, "Suporte Técnico", 20);
        Tecnico tecnico2 = new Tecnico("Dave", 25.0, 160, "Manutenção", 10);

        funcionarios.add(docente1);
        funcionarios.add(docente2);
        funcionarios.add(docente3);
        funcionarios.add(tecnico1);
        funcionarios.add(tecnico2);

        System.out.println("");
        System.out.println("=-=-=-=-=-=-= Fundacao Pedro Dahmer de Ensino e Pesquisa em Humanos =-=-=-=-=-=-=");
        System.out.println("");
        System.out.println("Funcionários:");
        System.out.println("");

        funcionarios.forEach(funcionario -> {
            System.out.println("Nome: " + funcionario.getNome());
            if (funcionario instanceof Docente) {
                Docente docente = (Docente) funcionario;
                System.out.println("Cargo: Docente");
                System.out.println("Titulação: " + docente.getTitulacao());
                System.out.println("Nível de Ensino: " + docente.getNivel());
            } else if (funcionario instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) funcionario;
                System.out.println("Cargo: Técnico");
                System.out.println("Função: " + tecnico.getFuncao());
                System.out.println("Horas Extras: " + (tecnico.getHorasExtras()));
            }
            System.out.println("Salário: R$ " + String.format("%.2f", funcionario.calcularSalario()));
            System.out.println("");
        });

        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
    }
}