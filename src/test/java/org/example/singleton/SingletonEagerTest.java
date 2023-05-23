package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SingletonEagerTest {

    @Test
    void DEVE_obter_uma_instancia_SingletonEager() {
        //given
        Class<SingletonEager> exptected = SingletonEager.class;

        //when
        SingletonEager acutal = SingletonEager.getInstance();

        //then
        assertInstanceOf(exptected, acutal);
    }

    @Test
    void NAO_DEVE_retornar_instancia_SingletonEager() {
        //given
        Class<String> exptected = String.class;

        //when
        SingletonEager actual = SingletonEager.getInstance();

        //then
        assertNotEquals(exptected, actual);
    }
}
