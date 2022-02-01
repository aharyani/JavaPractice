package com.ammar.problem.solving.binary.search;

public class binarySearch {
    public static void main(String[] args) {
    floor();
    }

    static void normal(){
        int[] num = {11,23,33,44,55,66,77,88,99};
        int start = 0;
        int end = num.length-1;
        int target = 8;
        int flag=0;
        int mid=0;

        while (start<=end) {
            mid = (start+end) / 2;
            System.out.println(mid);
            if(target>num[mid])
                start = mid+1;
            else if(target<num[mid])
                end = mid-1;
            else  if (num[mid] == target){
                flag++;
                System.out.println("found at index "+ (mid+1));
                break;
            }

        }

        if(flag==0)
        {
            System.out.println("Not found");
        }
    }
    static void ceil(){
        int[] num = {11,23,33,44,55,66,77,88,99};
        int start = 0;
        int end = num.length-1;
        int target = 999;
        int flag = 0;

        if (target > num[num.length - 1]) {
            System.out.println(target+" is greatest than the greater value in array which is "+num[end]);
            flag = -1;//return -1;
        }else {
            int mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                System.out.println(mid);
                System.out.println(mid);
                if (target > num[mid])
                    start = mid + 1;
                else if (target < num[mid])
                    end = mid - 1;
                else if (num[mid] == target) {
                    flag = 1;
                    System.out.println("found at index " + (mid + 1) + " = " + num[mid]);
                    break;
                }

            }
        }

        if(flag==0){
            System.out.println("found at index " + (start + 1) + " = " +num[start]);
        }



    }
    static void floor(){
        int[] num = {11,23,33,44,55,66,77,88,99};
        int start = 0;
        int end = num.length-1;
        int target = 78;
        int flag = 0;
        int mid=0;

        if (target > num[num.length - 1]) {
            System.out.println(target+" is greatest than the greater value in array which is "+num[end]);
            flag = -1;//return -1;
        }else {
             mid = 0;
            while (start <= end) {
                mid = (start + end) / 2;
                System.out.println(mid);
                System.out.println(mid);
                if (target > num[mid])
                    start = mid + 1;
                else if (target < num[mid])
                    end = mid - 1;
                else if (num[mid] == target) {
                    flag = 1;
                    System.out.println("found at index " + (mid + 1) + " = " + num[mid]);
                    break;
                }

            }
        }

        if(flag==0){
            System.out.println("found at index " + (end + 1) + " = " +num[end]);
        }



    }


}
