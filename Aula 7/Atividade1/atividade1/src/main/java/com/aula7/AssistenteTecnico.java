package com.aula7;

public class AssistenteTecnico extends Assistente  {

    private float bonusSalarial;

    // getters e setters
    public float getBonusSalarial() { return this.bonusSalarial; }
    public void setBonusSalarial(float b) { this.bonusSalarial = b; }

    //contructors
    public AssistenteTecnico() { }
    public AssistenteTecnico(String nome, Salario salario, int matricula, float bonusSalarial) {
        super.setNome(nome);
        super.setSalario(salario);
        super.setMatricula(matricula);
        this.bonusSalarial = bonusSalarial;
    }
}
