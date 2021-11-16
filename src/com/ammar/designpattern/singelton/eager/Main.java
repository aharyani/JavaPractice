package com.ammar.designpattern.singelton.eager;

public class Main {

    public static void main(String[] args) {

        /* Eager instantiate */
        System.out.println(SingletonEagerly.getInstance());
        System.out.println(SingletonEagerly.getInstance());

    }



}
