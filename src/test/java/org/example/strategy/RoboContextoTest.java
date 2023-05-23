package org.example.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboContextoTest {

    @Test
    void DEVE_mover_para_Frente() {
        // given
        RoboContexto contexto = new RoboContexto();
        ComportamentoStrategy strategy = new ComportamentoFrente();
        contexto.setComportamento(strategy);
        String expetecd = "FRENTE";

        // when
        String actual = contexto.mover();

        // then
        assertEquals(expetecd, actual);
    }

    @Test
    void DEVE_mover_para_ATRAS() {
        // given
        RoboContexto contexto = new RoboContexto();
        ComportamentoStrategy strategy = new ComportamentoAtras();
        contexto.setComportamento(strategy);
        String expetecd = "ATRAS";

        // when
        String actual = contexto.mover();

        // then
        assertEquals(expetecd, actual);
    }

    @Test
    void DEVE_mover_para_Lado_Direito() {
        // given
        RoboContexto contexto = new RoboContexto();
        ComportamentoStrategy strategy = new ComportamentoLadoDireito();
        contexto.setComportamento(strategy);
        String expetecd = "LADO DIREITO";

        // when
        String actual = contexto.mover();

        // then
        assertEquals(expetecd, actual);
    }

    @Test
    void DEVE_mover_para_Lado_Esquerdo() {
        // given
        RoboContexto contexto = new RoboContexto();
        ComportamentoStrategy strategy = new ComportamentoLadoEsquerdo();
        contexto.setComportamento(strategy);
        String expetecd = "LADO ESQUERDO";

        // when
        String actual = contexto.mover();

        // then
        assertEquals(expetecd, actual);
    }

}