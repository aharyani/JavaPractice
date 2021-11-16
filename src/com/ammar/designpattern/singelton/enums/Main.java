package com.ammar.designpattern.singelton.enums;

public class Main {

    public static void main(String[] args) {

        /* Enum Class */
        SingletonUsingEnum e1 = SingletonUsingEnum.INSTANCE;
        e1.i=5;
        e1.show();


        SingletonUsingEnum e2 = SingletonUsingEnum.INSTANCE;
        e2.i=6;
        e2.show();


        e1.show();






    }



}
