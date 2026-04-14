package com.aula.prova;

public class Main {
    public static void main(String[] args) {
        
        Pagamento[] pagamentos = new Pagamento[5];

        pagamentos[0] = new FuncionarioMensalista("Davi", 5320);
        pagamentos[1] = new Comissionado(300500, 1, "Felipe", 2720);
        pagamentos[2] = new FuncionarioHorista(352, 48, "Odemir");
        pagamentos[3] = new FuncionarioMensalista("Renato", 13050);
        pagamentos[4] = new Comissionado(1000000, 0.5, "Pedro Dahmer", 3278);

        System.out.println("\n=-=-=-=-= Resumo dos Pagamentos =-=-=-=-=\n");
        for (Pagamento pagamento : pagamentos) {
            pagamento.exibirResumo();
            pagamento.calcularPagamento();
            System.out.println();
        }
        System.out.println("\n=-=-=-=-= Fim do Resumo =-=-=-=-=\n");
    }
}