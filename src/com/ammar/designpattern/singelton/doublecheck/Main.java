package com.ammar.designpattern.singelton.doublecheck;

/**
 * double
 */
public class Main {

    public static void main(String[] args) {

        /* double check */
        Thread t1 = new Thread(()-> System.out.println(SingletonDoubleCheck.getInstance()));
        Thread t2 = new Thread(()-> System.out.println(SingletonDoubleCheck.getInstance()));

        t1.start();
        t2.start();


    }



}
