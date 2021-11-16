package com.ammar.designpattern.singelton.doublecheck;

/**
 * synchronize take time
 * due to drawback of method synchronized we use double check
 * it reduce time to 100ms to 7ms
 *
 * reduce time because synchronized has its own structure,
 * we have to put sychronized into method when single check is used to ensure thread safe which is overhead
 * because every time it goes into synchronized structure which takes time
 * solution: double check --> we put synchronized in condition block after it we again check the conditon
 * instead of method
 */
public class SingletonDoubleCheck {
    static SingletonDoubleCheck doubleCheck;

    private SingletonDoubleCheck(){

    }

    public static SingletonDoubleCheck getInstance(){

        if(doubleCheck==null){
            synchronized (SingletonDoubleCheck.class){
                if(doubleCheck==null){
                    doubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return doubleCheck;
    }

}
