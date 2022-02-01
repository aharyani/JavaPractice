package com.ammar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.function.Consumer;

public class Prac {


    int eyes = 10;

//    public static void main(String[] args) {
//        String str = "cd";
//        List<String> words = new ArrayList<>();
//        for(int i=0 ; i<str.length();i++){
//            System.out.print(str.charAt(i));
//            for(int j=0 ; j<str.length() ; j++){
//                System.out.print(str.charAt(j));
//            }
//        }
//    }

//    public static void main(String[] args) {
//        DemoChild2 demo = new DemoChild2();
//        System.out.println(demo.eyes);
//    }

/**                                             String is Isogram or Not
 public static void main(String[] args) {
 boolean flag = true ;
 String word = "abcda";
 char[] charArray = word.toCharArray();
 Set set = new HashSet();

 for(char c : charArray){
 if(!set.add(c)){
 flag = false;
 break;
 }
 }

 System.out.println("the "+word+" is Isogram ----> "+flag);


 }
 **/

    /**
     * ODD even using binary Operator
     * public static void main(String[] args) {
     * if((5&1)==1)
     * System.out.println("Odd");
     * else
     * System.out.println("Even");
     * <p>
     * }
     **/





       /**                      *************   NUMBER OF ISLAND    *************
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'1', '0', '0', '1', '1'}};


        int result = numOfIsland(grid);
        System.out.println(result);

    }

    public static int numOfIsland(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    breadthFristSearch(grid, i, j);
                }
            }

        }

        return count;
    }


    public static void breadthFristSearch(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        breadthFristSearch(grid, i - 1, j);   // down
        breadthFristSearch(grid, i + 1, j);   // up
        breadthFristSearch(grid, i, j - 1);   // left
        breadthFristSearch(grid, i, j + 1);   // right
    }
    **/







/**                     *************          Pascal Triangle        *************
    public static void main(String[] args) {
       pascalTriangle(10).forEach(System.out::println);
    }


    public static List<List<Integer>> pascalTriangle(int totalRow){
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for (int i = 1; i < totalRow; i++) {
            List<Integer> previousRow = pascalTriangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int j = 1; j < i; j++) {
                newRow.add(previousRow.get(j-1)+previousRow.get(j));
            }
            newRow.add(1);
            pascalTriangle.add(newRow);
        }

        return pascalTriangle;
    }

*/


}


//}
//
//
//class DemoChild extends Prac{
//    int eyes =1;
//    DemoChild(){
//        eyes = super.eyes;
//    }
//}
//
//class DemoChild2 extends  DemoChild{
//    DemoChild2(){
//        super();
//    }
//
//}