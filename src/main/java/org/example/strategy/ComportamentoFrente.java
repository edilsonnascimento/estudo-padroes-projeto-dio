package org.example.strategy;

public class ComportamentoFrente implements ComportamentoStrategy {
    @Override
    public String mover() {
        return "FRENTE";
    }
}
