package com.ammar.problem.solving.arrayList.pascal.triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int totalRow = 10;

        pascalTriangle(totalRow).forEach(System.out::println);


    }

    public static List<List<Integer>> pascalTriangle(int numOfrow) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numOfrow; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

}
