package org.example.strategy;

public class ComportamentoAtras implements ComportamentoStrategy {
    @Override
    public String mover() {
        return "ATRAS";
    }
}
