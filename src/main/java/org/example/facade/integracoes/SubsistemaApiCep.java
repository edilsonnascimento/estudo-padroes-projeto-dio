package org.example.facade.integracoes;

public class SubsistemaApiCep {
    private static SubsistemaApiCep instancia = new SubsistemaApiCep();

    private SubsistemaApiCep() {
        super();
    }

    public static SubsistemaApiCep getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cascavel";
    }

    public String recuperarEstado(String cep) {
        return "Paraná";
    }
}