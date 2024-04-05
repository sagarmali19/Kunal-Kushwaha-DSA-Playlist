package com.sagar;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 56, 89},
                {2, 4},
                {8, 0, -1}
        };

        int target = 4;
        System.out.println(Arrays.toString(searchIn2D(arr, target)));
    }

    private static int[] searchIn2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    int[] sol = {i, j};
                    return sol;
                }
            }
        }

        return null;
    }
}
