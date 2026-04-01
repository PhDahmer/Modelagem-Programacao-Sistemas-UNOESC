package com.aula7;

public class AssistenteAdministrativo extends Assistente {

    private float adicionalNoturno;

    // getters e setters
    public float getAdicionalNoturno() { return this.adicionalNoturno; }
    public void setAdicionalNoturno(float a) { this.adicionalNoturno = a; }

    //contructors
    public AssistenteAdministrativo() { }
    public AssistenteAdministrativo(String nome, Salario salario, int matricula, float adicionalNoturno) {
        super.setNome(nome);
        super.setSalario(salario);
        super.setMatricula(matricula);
        this.adicionalNoturno = adicionalNoturno;  
    }

}
