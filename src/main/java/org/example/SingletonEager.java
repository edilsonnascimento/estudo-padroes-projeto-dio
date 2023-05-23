package org.example;

public class SingletonEager {
    private final static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}