package com.ammar.problem.solving.cycle.sort.disappear.number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DisappearNum {

    public static List<Integer> findDisappearNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int curr = Math.abs(num[i]);
            num[curr - 1] = -Math.abs(num[curr - 1]);
        }

        return IntStream.range(0, num.length)
                .filter(i->num[i] > 0)
                .mapToObj(i -> i+1)
                .collect(Collectors.toList());

//       List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] > 0)
//                result.add(i + 1);
//        }
//
//        return result;
    }
}
