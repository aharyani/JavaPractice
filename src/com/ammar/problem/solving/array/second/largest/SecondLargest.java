package com.ammar.problem.solving.array.second.largest;

public class SecondLargest {
    public static void main(String[] args) {
        secondLargest();
    }

   public static void secondLargest(){
       int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        int[] num = {1,2,3,4,5,5,3};

        for(int i=0 ; i< num.length ; i++){
            if(num[i]>largest){
                secondLargest = largest;
                largest = num[i];
            }else if (secondLargest<num[i] && num[i]!=largest){
                secondLargest = num[i];
            }
        }

        System.out.println("largest Number is "+ largest);

        System.out.println("Second Largest Number is "+ secondLargest);

    }
}
