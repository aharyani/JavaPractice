package com.ammar.designpattern.singelton.lazy;

public class Main {

    public static void main(String[] args) {

        /* Lazy instantiate */
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());

    }



}
