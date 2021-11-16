package com.ammar.development.training.assignment.task1.inheritandencaps.problem.four.point.three;

public class ProgrammingLanguage implements Java,C{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        Java.super.show();
    }

}
