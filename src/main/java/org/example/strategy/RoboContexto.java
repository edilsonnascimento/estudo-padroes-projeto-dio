package org.example.strategy;

public class RoboContexto {

    ComportamentoStrategy comportamento;

    public void setComportamento(ComportamentoStrategy comportamento) {
        this.comportamento = comportamento;
    }
    public String mover() {
        return comportamento.mover();
    }
}