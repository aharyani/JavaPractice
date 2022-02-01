package com.ammar.problem.solving.arrayList.shortest.continuous.sub.array.sort;

import java.util.Arrays;

public class ShortestSubArray {


    public static void main(String[] args) {
        int[] num = {2, 6, 4, 8, 10, 9, 15};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int v = num.length - 1;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[i + 1]) {
                min = Math.min(min, num[i + 1]);
            }

            for (int j = num.length - 1; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    max = Math.max(max, num[v - 1]);
                }
            }


        }

        int l, r;

        for (l = 0; l < num.length; l++) {
            if (min < num[l]) {
                break;
            }
        }

        for (r = num.length - 1; r > 0; r--) {
            if (max > num[l]) {
                break;
            }
        }
        System.out.println(l - r < 0 ? 0 : r - l + 1);
    }

//    public static void main(String[] args) {
//        int[] num = {2,6,4,8,10,9,15};
//        findContinuousUnsortedSubArray(num);
//    }


//    public static void findContinuousUnsortedSubArray(int[] num) {
//        int[] record = num.clone();
//        int length = num.length;
//        Arrays.sort(record);
//
//        for(int i=0 ; i < num.length; i++){
//            if(num[i]==record[i])
//                length--;
//            else
//                break;
//        }
//
//        for (int j=num.length-1 ; j>0 ; j--){
//            if(num[j]==record[j])
//                length--;
//            else
//                break;
//        }
//
//        System.out.println(length);
//    }

}


//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int v = num.length-1;
//
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]>num[i+1]){
//                    min = Math.min(min,num[i+1]);
//            }
//
//            for (int j = num.length-1; j > 0; j--) {
//                if(num[j]<num[j-1]) {
//                    max = Math.max(max, num[v - 1]);
//                }
//            }
//
//
//        }
//
//        int l ,r;
//
//        for ( l = 0; l < num.length; l++) {
//            if(min<num[l]){
//                break;
//            }
//        }
//
//        for ( r = num.length-1; r > 0; r--) {
//            if(max>num[l]){
//                break;
//            }
//        }
//        System.out.println(l-r<0?0:r-l+1);