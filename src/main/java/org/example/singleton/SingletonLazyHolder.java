package org.example.singleton;

public class SingletonLazyHolder {

    public static class InstanceHolder {
        private final static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}