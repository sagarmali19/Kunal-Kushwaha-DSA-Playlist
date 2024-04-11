package com.sagar;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42}
        };
        int target = 32;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        while(r < matrix.length && c >= 0){
            if(target == matrix[r][c]){
                return new int[]{r,c};
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else{
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}


