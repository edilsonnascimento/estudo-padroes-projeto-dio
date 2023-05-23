package org.example.strategy;

public class ComportamentoLadoEsquerdo implements ComportamentoStrategy {
    @Override
    public String mover() {
        return "LADO ESQUERDO";
    }
}
