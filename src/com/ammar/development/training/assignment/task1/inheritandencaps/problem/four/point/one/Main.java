package com.ammar.development.training.assignment.task1.inheritandencaps.problem.four.point.one;

public class Main {

    public static void main(String[] args){

             /*Q4: Abstract class and interface. (difference) interface mulitple inheritance
        (if both interfaces method same then what is the behaviour,abstract class and interface)*/

        //Q4.1:Example of Multiple Inheritance in Interface
        System.out.println("\t\t\t Q4.1: Example of Multiple Inheritance in Interface ");
        Child child = new Child();
        System.out.println("Variable define in Father Interface :"+child.x);
       // child.x = 20; //Compile-time error because Variables declared in interface are public, static and final by default.
        child.laziness();
        child.height();
        child.intelligence();
        child.cooking();
        System.out.println("Multiple inheritance is allowed in Interface in java");


    }

}
