package org.example.strategy;

public class ComportamentoLadoDireito implements ComportamentoStrategy {
    @Override
    public String mover() {
        return "LADO DIREITO";
    }
}
