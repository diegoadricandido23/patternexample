package br.com.diego.designpatterns.singleton;

/**
 * Singleton 'apressado'
 * @author dcandido
 * */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
