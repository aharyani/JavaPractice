package com.ammar.designpattern.singelton.eager;

/**
 * Eager created even you dont want to use it, it will be created
 * it is memory consuming perhaps if we dont want to use it, it will create object in memory.
 */

public class SingletonEagerly {

    static final SingletonEagerly eagerly = new SingletonEagerly(); //-----> Eagerly Created

    private SingletonEagerly(){
    }

    public  static SingletonEagerly getInstance(){
        return eagerly;
    }




}
