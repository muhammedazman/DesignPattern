package com.muhammedazman;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    // private Constructor
    private ThreadSafeSingleton(){}

    // if multi-thread running, use synchronized
    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null)
            threadSafeSingleton = new ThreadSafeSingleton();

        return threadSafeSingleton;
    }

    public void singletonTest(){
        System.out.println("Thread Safe Singleton method run");
    }
}
