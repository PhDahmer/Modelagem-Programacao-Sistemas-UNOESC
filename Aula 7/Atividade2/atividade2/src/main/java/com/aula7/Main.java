package com.aula7;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Digite o valor: ");
        float valor = sc.nextFloat();

        System.out.print("Digite 1 para imóvel novo ou 2 para imóvel usado: ");
        int tipo = sc.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Imovel imovel; 

        if(tipo == 1) {
            System.out.print("Digite o valor adicional: ");
            float valorAdicional = sc.nextFloat();
            imovel = new ImovelNovo(endereco, valor, valorAdicional);

        } else if(tipo == 2) {
            System.out.print("Digite o valor do desconto: ");
            float valorDesconto = sc.nextFloat();
            imovel = new ImovelUsado(endereco, valor, valorDesconto);

        } else {
            System.out.println("Tipo de imóvel inválido!");
            return;
        }

        System.out.println("Valor final do imóvel: " + imovel.calcularValorFinal());
    }
    }
