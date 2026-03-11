package com.example;

import java.util.Scanner;

public class Lista2 {

    public static double salarioBruto(int qtHoras, double valorHora) {
        return qtHoras * valorHora;
    }

    public static double ir(double salarioBruto) {
        double retorno = switch(salarioBruto) {
            case double d when d <= 1434 -> 0.0;
            case double d when d > 1434 && d <= 2150 -> salarioBruto * 0.075;
            case double d when d > 2150 && d <= 2886 -> salarioBruto * 0.15;
            case double d when d > 2886 && d <= 3582 -> salarioBruto * 0.225;
            case double d when d > 3582 -> salarioBruto * 0.275;
            default -> 0.0;
        };
        return retorno;
    }

    public static double inss(double salarioBruto) {
        double inss = switch(salarioBruto) {
            case double d when d <= 965.67 -> salarioBruto * 0.08;
            case double d when d > 965.67 && d <= 1609.45 -> salarioBruto * 0.11;
            case double d when d > 1609.45 -> salarioBruto * 0.14;
            default -> 0.0;
        };
        inss = (inss > 354.07) ? 354.07 : inss;
        return inss;
    }

    public static double sindicato(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    public static double salarioLiquido(double salarioBruto, double ir, double inss, double sindicato) {
        return salarioBruto - ir - inss - sindicato;
    }

    public static double fgts(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public static void mostrarResultado(int qtHoras, double valorHora, int nfuncionario) {
        double salarioBruto = salarioBruto(qtHoras, valorHora);
        double ir = ir(salarioBruto);
        double inss = inss(salarioBruto);
        double sindicato = sindicato(salarioBruto);
        double salarioLiquido = salarioLiquido(salarioBruto, ir, inss, sindicato);
        double fgts = fgts(salarioBruto);


        System.out.println("=============================");
        System.out.println("Funcionario " + nfuncionario);
        System.out.println("(+) Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + ir);
        System.out.println("(-) INSS: R$ " + inss);
        System.out.println("(-) Sindicato: R$ " + sindicato);
        System.out.println("(+) Salário Líquido: R$ " + salarioLiquido);
        System.out.println("(+) FGTS: R$ " + fgts);
    }


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
        }
        
    public static void atividade11(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de funcionários: ");
        int nFuncionarios = scan.nextInt();

        int i = 1;
        while (i <= nFuncionarios) {
            System.out.println("Quantidade de horas trabalhadas funcionarios " + i + ": ");
            int qtHoras = scan.nextInt();

            System.out.println("Valor da hora " + i + ": ");
            double valorHora = scan.nextDouble();

            mostrarResultado(qtHoras, valorHora, i);
            i++;
        }
    }
    
    public static void main(String[] args) {
        atividade11();
    }
}
