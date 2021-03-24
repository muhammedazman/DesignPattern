package com.muhammedazman;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    // private Constructor
    private LazySingleton(){}


    // not Thread-Safe !!!
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();

        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy Singleton method run");
    }
}
