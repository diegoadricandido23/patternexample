package br.com.diego.designpatterns.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo Defensivamente");
    }
}
