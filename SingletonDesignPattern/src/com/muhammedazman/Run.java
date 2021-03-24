package com.muhammedazman;

public class Run {

    /***
     * SINGLETON DESIGN PATTERN
     * - Eager Initialization
     * - Static Block initialization
     * - Lazy initialization
     * - ThreadSafe Singleton
     * - Bill Pugb Singleton
     */
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getLazySingleton().singletonTest();
    }
}
