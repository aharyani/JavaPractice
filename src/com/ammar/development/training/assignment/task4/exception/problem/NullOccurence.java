package com.ammar.development.training.assignment.task4.exception.problem;

public class NullOccurence {
    public static void occur() {
        try {
            String blankString = null;
            System.out.println("String length :" + blankString.length());
            //calling custom null pointer exception.
        } catch (NullPointerException exp) {
            throw new MyCustomNullException("Using My Custom Null Exception");
        }
    }
}
