package com.ammar.development.training.assignment.task1.inheritandencaps.problem.four.point.one;

public interface Father extends GrandFather,GrandMother{
    //  An interface can extend one or multiple interface but cannot implement it.
    //  Class implements interface and interface extends interface.

    int x=10;
    void height();
}
