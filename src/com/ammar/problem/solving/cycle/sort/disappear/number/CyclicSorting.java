package com.ammar.problem.solving.cycle.sort.disappear.number;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// when there is 1 to N or 0 to N its mean we have to use cyclic sorting
public class CyclicSorting {
    public static void main(String[] args) {
        int[] num = {1, 3, 3, 4, 2, 2};
        List<Integer> nums = Arrays.asList(1,2,3,4,5,5,4,3);
       // int[] duplicateNum = duplicateNumber(num);
       // Arrays.stream(duplicateNum).forEach(System.out::println);
      //   Arrays.stream(sorting(num)).forEach(System.out::println);
       // Arrays.stream(findDisappearNumAndRepeatation(num)).forEach(System.out::println);
        System.out.println(findDisappearNumAndRepeatation(num,nums));
//
    }

    public static int[] sorting(int[] num) {
        int length = num.length;
        int i = 0;

        while (i < length) {
            int correct = num[i] - 1;
            if (num[correct] != num[i]) {
                int temp = num[i];
                num[i] = num[correct];
                num[correct] = temp;
            }
            i++;
        }

        return num;
    }

    public static int[] duplicateNumber(int[] num) {

        int length = num.length;
        int i = 0;

        while (i < length) {
            int correct = num[i] - 1;
            if (num[correct] != num[i]) {
                int temp = num[i];
                num[i] = num[correct];
                num[correct] = temp;
            }
            i++;
        }

        return IntStream.range(0, num.length).filter(j->j+1!=num[j]).map(j->num[j]).toArray();
    }

    public static int[] findDisappearNumUsingDifferentApproach(int[] num) {
        int length = num.length;
        int i = 0;

        while (i < length) {
            int correct = num[i] - 1;
            if (num[correct] != num[i]) {
                int temp = num[i];
                num[i] = num[correct];
                num[correct] = temp;
            }
            i++;
        }

       return num;
    }

    public static int[] findDisappearNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int curr = Math.abs(num[i]);
            num[curr - 1] = -Math.abs(num[curr - 1]);
        }

        return IntStream.range(0, num.length)
                .filter(i -> num[i] > 0)
                .map(i -> i + 1)
                .toArray();
    }

    public static Map<Integer,Long> findDisappearNumAndRepeatation(int[] num,List<Integer> nums) {

//        for (int i = 0; i < num.length; i++) {
//            int curr = Math.abs(num[i]);
//            num[curr - 1] = -Math.abs(num[curr - 1]);
//        }

        for (int i = 0; i < nums.size(); i++) {
            int curr = Math.abs(nums.get(i));
            nums.add(curr-1,-Math.abs(nums.get(curr - 1)));
        }




        return nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }






}
