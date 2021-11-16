package com.ammar.problem.solving.arrayList.pascal.triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int totalRow = 10;

        pascalTriangle(totalRow).forEach(System.out::println);


    }

    public static List<List<Integer>> pascalTriangle(int totalRow) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < totalRow; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            triangle.add(row);
            //     triangle.forEach(System.out::println);
        }
        return triangle;

    }
}
