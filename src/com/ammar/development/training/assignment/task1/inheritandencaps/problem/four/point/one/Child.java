package com.ammar.development.training.assignment.task1.inheritandencaps.problem.four.point.one;

public class Child implements Father{

    public void laziness(){
        System.out.println("Child's Laziness");
    }

    @Override
    public void height() {
        System.out.println("Father's Height");
    }

    @Override
    public void intelligence() {
        System.out.println("GrandFather's Intelligence");
    }

    @Override
    public void cooking() {
        System.out.println("GrandMother's Cooking");
    }
}
