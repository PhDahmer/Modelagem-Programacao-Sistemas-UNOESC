package com.mycompany.polimorfismo;

public class ContaPF implements Conta {
    @Override
    public void solicitaDocumentos() {
        System.out.println("Documentos necessarios Conta PF");
        System.out.println("-Identidade\n-CPF\n-Comprovante de residencia");
    }
}
