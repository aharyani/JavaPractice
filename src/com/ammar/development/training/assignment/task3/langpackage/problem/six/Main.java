package com.ammar.development.training.assignment.task3.langpackage.problem.six;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /**
         *  5. Write a Java program to count the number of Prime Numbers less than a given positive number.
         *  Hint: To complete the above program, you can also start with a program to find if any given number is prime or not?
         */


       // PrimeNumber.primeNumber(10);

        int num =50;

        // Continue iteration till it get 10 values of prime number in list because we limit it to 10
     //  List numbers = Stream.iterate(1,i->i+1).filter(PrimeNumber::primeNumber).limit(10).collect(Collectors.toList());
        IntStream.rangeClosed(0,num)
                .filter(PrimeNumber::primeNumber)
                .forEach(System.out::println);


        StringDuplicates.repeatingWords();
        StringDuplicates.repeatingCharacters();

        IntergerDuplicates.storeDuplicateOnes();
    }



}
