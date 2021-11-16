package com.ammar.development.training.assignment.task6.collectionandgeneric.problem.one.point.four;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntergerDuplicates {

    static void storeDuplicateOnes(){

        //Find Duplicate elements in a given Integer list in java using Stream
        List<Integer> list = Arrays.asList(10,20,30,10,20,87,80,80,80);
        Set<Integer> setList  = new HashSet<>();
        list.stream().filter(i->!setList.add(i)).collect(Collectors.toSet()).forEach(System.out::println);
    }

}
