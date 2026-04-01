package com.aula7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Assistente("João", new Salario(30, 200), 123));
        funcionarios.add(new AssistenteTecnico("Maria", new Salario(50, 160), 456, 500));
        funcionarios.add(new AssistenteAdministrativo("Pedro", new Salario(49, 180), 789, 200));

        System.out.println("=-=-=-=-=-=-= Salarios dos pobres =-=-=-=-=-=-=");
        for(Funcionario funcionario : funcionarios) {
            funcionario.getSalario().calcularTudo();
            System.out.println("");
            funcionario.exibirDados();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}