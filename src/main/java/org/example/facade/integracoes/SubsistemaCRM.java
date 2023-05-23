package org.example.facade.integracoes;

public class SubsistemaCRM {

    public SubsistemaCRM() {
        super();
    }

    public static Cliente gravarCLiente(String nome, String cep, String cidade, String estado) {
        return new Cliente(nome, cep, cidade, estado, "ATIVO");
    }
}
