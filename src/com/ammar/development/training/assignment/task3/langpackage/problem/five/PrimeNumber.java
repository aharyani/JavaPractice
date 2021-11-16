package com.ammar.development.training.assignment.task3.langpackage.problem.five;

public class PrimeNumber {

    static int primeNumber(int num) {
        int flag;
        int count = 0;

        for (int i = 2; i < num; i++) {
            flag = 1;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
            }
        }

        return count;
    }


}