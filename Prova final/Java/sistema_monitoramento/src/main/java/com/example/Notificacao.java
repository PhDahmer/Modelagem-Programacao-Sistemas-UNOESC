package com.example;

import java.util.Date;

public class Notificacao {

    private String mensagem;
    private Date dataHora;

    // construtores
    public Notificacao(String mensagem, Date dataHora) {
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public Notificacao() {
    }

    // Getters e Setters
    public String getMensagem() { return this.mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public Date getDataHora() { return this.dataHora; }
    public void setDataHora(Date dataHora) { this.dataHora = dataHora; }

    // metodos
    public void enviar() {
        // Implementação do envio de notificação
        System.out.println("Enviando notificação: " + this.mensagem + " às " + this.dataHora);
    }

}
