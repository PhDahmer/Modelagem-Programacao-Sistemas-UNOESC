package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Conta []conta = new Conta[5];
        
        conta[0] = new ContaPF();
        conta[1] = new ContaPJ();
        conta[2] = new ContaPF();
        conta[3] = new ContaPJ();
        conta[4] = new ContaPJ();
        
        
        for(int i=0; i < conta.length; i++) {
            conta[i].solicitaDocumentos();
            System.out.println("--------------------------");
        }
    }
}
