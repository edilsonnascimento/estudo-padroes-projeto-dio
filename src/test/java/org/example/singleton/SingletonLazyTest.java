package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SingletonLazyTest {

    @Test
    void DEVE_obter_uma_instancia_SingletonLay() {
        //given
        Class<SingletonLazy> exptected = SingletonLazy.class;

        //when
        SingletonLazy acutal = SingletonLazy.getInstance();

        //then
        assertInstanceOf(exptected, acutal);
    }

    @Test
    void NAO_DEVE_retornar_instancia_SingletonLazy() {
        //given
        Class<String> exptected = String.class;

        //when
        SingletonLazy actual = SingletonLazy.getInstance();

        //then
        assertNotEquals(exptected, actual);
    }
}