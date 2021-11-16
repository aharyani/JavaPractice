package com.ammar.development.training.assignment.task4.exception.problem;

public class MyCustomNullException extends NullPointerException{

    public MyCustomNullException(String message) {
        super("Caught NullPointerException : "+message);
    }


}
