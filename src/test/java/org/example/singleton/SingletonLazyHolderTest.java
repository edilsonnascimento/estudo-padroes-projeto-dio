package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SingletonLazyHolderTest {
    @Test
    void DEVE_obter_uma_instancia_SingletonLazyHolder() {
        //given
        Class<SingletonLazyHolder> exptected = SingletonLazyHolder.class;

        //when
        SingletonLazyHolder acutal = SingletonLazyHolder.getInstance();

        //then
        assertInstanceOf(exptected, acutal);
    }

    @Test
    void NAO_DEVE_retornar_instancia_SingletonLazyHolder() {
        //given
        Class<String> exptected = String.class;

        //when
        SingletonLazyHolder actual = SingletonLazyHolder.getInstance();

        //then
        assertNotEquals(exptected, actual);
    }
}
