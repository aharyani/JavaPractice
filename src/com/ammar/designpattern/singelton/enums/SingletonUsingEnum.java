package com.ammar.designpattern.singelton.enums;
/**
 * Enum Class is a Special type class which can be used for Singleton pattern by only defining keyword "INSTANCE;"
 * Enum Class have by default -----> private constructor
 */
public enum SingletonUsingEnum {
    INSTANCE;
    int i;

    public void show(){
        System.out.println(i);
    }
}