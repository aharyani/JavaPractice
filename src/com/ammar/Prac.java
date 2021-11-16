package com.ammar;

import java.util.*;
import java.util.function.Consumer;

public class Prac {

    public static void main(String[] args) {
        String str = "cd";
        for(int i=0 ; i<str.length();i++){
            System.out.print(str.charAt(i));
            for(int j=0 ; j<str.length() ; j++){
                System.out.print(str.charAt(j));
            }
            System.out.print(", ");
        }
    }


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

/**                                          ODD even using binary Operator
    public static void main(String[] args) {
        if((5&1)==1)
            System.out.println("Odd");
        else
            System.out.println("Even");

    }
 **/

    /**                                          NUMBER OF ISLAND
    public static void main(String[] args) {
        char[][] grid = { {'1','1','0','0','0'},
                           {'1','1','0','0','0'},
                            {'0','0','1','0','0'},
                           {'0','0','0','1','1'} };


        Prac prac = new Prac();
       int result = prac.numOfIsland(grid);
        System.out.println(result);

    }

    public int numOfIsland(char[][] grid){
        int count = 0;
        for(int i = 0 ; i< grid.length ; i++){
            for(int j=0 ; j<grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    breadthFristSearch(grid,i,j);
                }
            }
        }
        return count;
    }


    public void breadthFristSearch(char[][] grid,int i,int j){

        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        breadthFristSearch(grid,i+1,j);//up
        breadthFristSearch(grid,i-1,j);//down
        breadthFristSearch(grid,i,j+1);//right
        breadthFristSearch(grid,i,j-1);//left

    }
     **/

/**                                                  Pascal Triangle
 *
    public static void main(String[] args) {
        Prac prac = new Prac();
        prac.pascal(10).forEach(System.out::println);
    }

    public List<List<Integer>>  pascal(int numOfrow){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numOfrow; i++) {
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
*/

}
