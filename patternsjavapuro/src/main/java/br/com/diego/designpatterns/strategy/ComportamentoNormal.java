package br.com.diego.designpatterns.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo Normalmente");
    }
}
