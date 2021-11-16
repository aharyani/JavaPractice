package com.ammar.development.training.assignment.task1.inheritandencaps.problem.four.point.three;

public interface Java {
    void print();
    default void show(){
        System.out.println("In Java show");
    }
}
