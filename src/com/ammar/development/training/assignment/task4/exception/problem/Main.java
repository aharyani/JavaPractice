package com.ammar.development.training.assignment.task4.exception.problem;

/**
 *  you ask me one question in exception handling that why i dont extend my custom exception to Exception class
 *  because exception class have two child classes
 *  one for checked exception which is handled through method signature and
 *  one for unchecked exception that is runtime error,
 *  so the task was for null pointer exception its comes in category of unchecked,
 *  if i extend my custom class with exception it will become general exception that is for all type of exception
 *  and it will handled in method signature instead of try catch
 */
public class Main {
    public static void main(String[] args) {

        /**
         *1. Write a Java program to create a custom exception class that deals with NULL Strings 
         *   (your custom exception should be thrown if String is NULL)
         */

        NullOccurence.occur();
    }

}


//        try {
//            Occurence.occur();
//        } catch (MyCustomNullException exp) {
//            System.out.println("Caught NullPointerException : " + exp.getMessage());
//        }