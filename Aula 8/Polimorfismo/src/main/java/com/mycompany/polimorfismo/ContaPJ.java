package com.mycompany.polimorfismo;

public class ContaPJ implements Conta {
    @Override
    public void solicitaDocumentos() {
        System.out.println("Documentos necessarios Conta PJ");
        System.out.println("-CNPJ\n-Comprovante de endereco\n-Dados socios");
    }
}
