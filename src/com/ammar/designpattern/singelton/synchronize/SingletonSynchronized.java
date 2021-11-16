package com.ammar.designpattern.singelton.synchronize;

/**
 * in lazy there is draw back that if run the instance in two different threads,
 * so at the same time both reach to if method that object is null
 * and both goes into if method
 * solution :
 * we use Synchronized Keyword that synchronized between threads
 * Synchronized will decrease the performce of system by factor of 100
 */
public class SingletonSynchronized {
    private static SingletonSynchronized sync;

    private SingletonSynchronized(){
        System.out.println("Synchronized");
    }

    public static synchronized SingletonSynchronized getInstance(){
        if(sync==null){
            sync =new SingletonSynchronized();
        }
        return sync;
    }

}
