package com.ammar.problem.solving.breadth.first.search;


/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIsland {


    public static int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0 ; i< grid.length ;i++){
            for(int j=0 ; j<grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    callbreadthFirstSearch(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void callbreadthFirstSearch(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0'){
            return;
        }

        grid[i][j]='0';
        callbreadthFirstSearch(grid,i,j+1); //right
        callbreadthFirstSearch(grid,i,j-1); //left
        callbreadthFirstSearch(grid,i+1,j); //up
        callbreadthFirstSearch(grid,i-1,j); //down

    }

    public static void main(String[] args) {
        char[][] grid = { {'1','1','0','0','0'},
                          {'1','1','0','0','0'},
                          {'0','0','1','0','0'},
                          {'0','0','0','1','1'} };
        System.out.println(numIslands(grid));
    }




}
