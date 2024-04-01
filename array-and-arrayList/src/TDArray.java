import java.util.Arrays;
import java.util.Scanner;

public class TDArray {
    public static void main(String[] args) {
        // for 2D array, defining column is not mandatory
        int[][] arr1 = new int[3][2];
        System.out.println(arr1.length);
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < arr1.length; row++) {
            for(int col = 0; col < arr1[row].length; col++){
                arr1[row][col] = input.nextInt();
            }
        }
//        for (int row = 0; row < arr1.length; row++) {
//            for(int col = 0; col < arr1[row].length; col++){
//                System.out.print(arr1[row][col] + " ");
//            }
//            System.out.println();
//        }

        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }

    }
}
