package com.example;

public class Main {
    public static void main(String[] args) {
        
         // Criação do prédio (Composição: Predio 1 -- 1..* Apartamento)
        Predio predio = new Predio(1, "Residencial Sol Nascente", "Rua das Flores, 123");

        // Criação dos apartamentos
        Apartamento apto101 = new Apartamento(1, "Residencial Sol Nascente", "Rua das Flores, 123", 1, 101);
        Apartamento apto102 = new Apartamento(2, "Residencial Sol Nascente", "Rua das Flores, 123", 1, 102);

        predio.adicionarApartamento(apto101);
        predio.adicionarApartamento(apto102);
        predio.listarApartamentos();

        // Criação de dispositivos inteligentes (Apartamento 1 -- * DispositivoInteligente)
        DispostivoInteligente ar = new DispostivoInteligente(1, "Ar Condicionado", "LG", "DualInverter", "Climatizacao", true, -45, 45.0);
        DispostivoInteligente geladeira = new DispostivoInteligente(2, "Geladeira", "Brastemp", "FrostFree", "Eletrodomestico", true, 0.8, 60.0);

        apto101.adicionarDispositivo(ar);
        apto101.adicionarDispositivo(geladeira);

        // UC01/UC02 - Recebimento e armazenamento de dados dos dispositivos
        ar.enviarDados();
        geladeira.enviarDados();

        // Criação do morador (associado a Predio e Apartamento)
        MoradorC morador = new MoradorC(1, "João Silva", "joao.silva", "senha123", predio, apto101);

        // UC03 - Autenticar usuário
        boolean loginOk = morador.autenticar("joao.silva", "senha123");
        System.out.println("Login do morador válido? " + loginOk);

        // UC14 / UC05 - Dashboard / Consultar consumo
        morador.visualizarConsumo();

        // UC06 - Visualizar histórico
        morador.consultarHistorico();

        // UC07 - Gerenciar alertas (limite de 1.0 kWh)
        Alerta alerta = new Alerta(1, 0, true);
        morador.gerenciarAlerta(alerta);

        // UC12 - Enviar alerta (extend de UC07, disparado se consumo > limite)
        boolean limiteExcedido = alerta.verificarConsumo(ar.obterConsumo());
        System.out.println("Limite excedido? " + limiteExcedido);

        // Criação do síndico (herda de MoradorC)
        SindicoC sindico = new SindicoC(2, "Maria Souza", "maria.souza", "admin123", predio, apto102);

        // UC03 - Autenticar síndico
        boolean loginSindico = sindico.autenticar("maria.souza", "admin123");
        System.out.println("Login do síndico válido? " + loginSindico);

        // UC08 - Gerenciar prédios
        sindico.gerenciarPredios();

        // UC09 - Gerenciar apartamentos
        sindico.gerenciarApartamentos();

        // UC10 - Gerenciar moradores
        sindico.gerenciarMoradores();

        // UC11 - Consultar consumo geral
        sindico.consultarConsumoGeral();

        // Logout (UC03 - encerramento de sessão)
        morador.logout();
        sindico.logout();
    }
}