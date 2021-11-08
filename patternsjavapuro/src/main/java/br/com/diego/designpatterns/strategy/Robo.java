package br.com.diego.designpatterns.strategy;

public class Robo {

    private Comportamento comportamento;

    public void mover() {
        this.comportamento.mover();
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
}
