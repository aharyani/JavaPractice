package com.ammar.designpattern.singelton.synchronize;

public class Main {

    public static void main(String[] args) {

        /* Synchronize */
        Thread t1 = new Thread(()-> System.out.println(SingletonSynchronized.getInstance()));
        Thread t2 = new Thread(()-> System.out.println(SingletonSynchronized.getInstance()));

        t1.start();
        t2.start();

    }



}
