package com.example;

public class Main {
    public static void main(String[] args) {
        
        Docente docente1 = new Docente("Alice", 50.0, 160, "Doutorado", 3);
        Docente docente2 = new Docente("Charlie", 40.0, 160, "Mestrado", 2);
        Docente docente3 = new Docente("Eve", 30.0, 160, "Graduação", 1);
        Tecnico tecnico1 = new Tecnico("Bob", 30.0, 160, "Suporte Técnico", 20);
        Tecnico tecnico2 = new Tecnico("Dave", 25.0, 160, "Manutenção", 10);

        System.out.println("");
        System.out.println("=-=-=-=-=-=-= Fundacao Pedro Dahmer de Ensino e Pesquisa em Humanos =-=-=-=-=-=-=");
        System.out.println("");
        System.out.println("Funcionários:");
        System.out.println("");
        System.out.println("" + docente1.getNome() + " - Titulação: " + docente1.getTitulacao() + ", Nível: " + docente1.getNivel() + ", Salário: " + docente1.calcularSalario());
        System.out.println("-");
        System.out.println("" + docente2.getNome() + " - Titulação: " + docente2.getTitulacao() + ", Nível: " + docente2.getNivel() + ", Salário: " + docente2.calcularSalario());
        System.out.println("-");
        System.out.println("" + docente3.getNome() + " - Titulação: " + docente3.getTitulacao() + ", Nível: " + docente3.getNivel() + ", Salário: " + docente3.calcularSalario());
        System.out.println("-");
        System.out.println("" + tecnico1.getNome() + " - Função: " + tecnico1.getFuncao() + ", Horas Extras: " + tecnico1.getHorasExtras() + ", Salário: " + tecnico1.calcularSalario());
        System.out.println("-");
        System.out.println("" + tecnico2.getNome() + " - Função: " + tecnico2.getFuncao() + ", Horas Extras: " + tecnico2.getHorasExtras() + ", Salário: " + tecnico2.calcularSalario());
        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
    }
}