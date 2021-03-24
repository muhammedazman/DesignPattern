package com.muhammedazman;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    // private Constructor
    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }

    public void singletonTest(){
        System.out.println("Eager Singleton method run");
    }
}
