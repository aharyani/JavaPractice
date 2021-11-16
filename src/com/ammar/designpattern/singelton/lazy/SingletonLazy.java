package com.ammar.designpattern.singelton.lazy;

/**
 * in lazy it will create object at a time when we call it unlike eager
 */

public class SingletonLazy {

    private static SingletonLazy lazy;

    private SingletonLazy(){
        System.out.println("Instance Created ");
    }

    public static SingletonLazy getInstance(){

        if(lazy ==  null) {
            lazy = new SingletonLazy();
        }
        return lazy;
    }

}
