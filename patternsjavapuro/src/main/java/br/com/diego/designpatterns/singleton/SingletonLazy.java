package br.com.diego.designpatterns.singleton;

/**
 * Singleton 'preguiçoco'
 * @author dcandido
 * */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        return instance == null ? new SingletonLazy() : instance;
    }
}
