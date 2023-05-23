package org.example.facade;

import org.example.facade.integracoes.Cliente;
import org.example.facade.integracoes.SubsistemaApiCep;
import org.example.facade.integracoes.SubsistemaCRM;

public class MigracaoDadosClienteFacade {

    private String nome;
    private String cep;
    private Cliente clienteGravado;

    public void migrar(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
        integracores();
    }

    private void integracores() {
        String cidade = SubsistemaApiCep.getInstance().recuperarCidade(cep);
        String estado = SubsistemaApiCep.getInstance().recuperarEstado(cep);
        clienteGravado = SubsistemaCRM.gravarCLiente(nome, cep, cidade, estado);
    }

    public Cliente getClienteGravado() {
        return clienteGravado;
    }
}