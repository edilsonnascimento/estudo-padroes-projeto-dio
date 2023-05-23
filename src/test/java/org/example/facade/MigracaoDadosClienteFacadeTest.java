package org.example.facade;

import org.example.facade.integracoes.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MigracaoDadosClienteFacadeTest {

    @Test
    void DEVE_migrar_cliente_CRM_adicinando_dados_ApiCEP() {
        // given
        String nome = "Pedro";
        String cep = "12313213";
        MigracaoDadosClienteFacade service = new MigracaoDadosClienteFacade();

        // when
        service.migrar(nome, cep);
        Cliente expected = service.getClienteGravado();

        // then
        assertEquals(expected.nome(), nome);
        assertEquals(expected.cep(), cep);
    }

}