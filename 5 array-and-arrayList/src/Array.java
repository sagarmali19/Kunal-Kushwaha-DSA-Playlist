import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Declare an array
        int[] rollNos = new int[5];
        // Declaration of array
        // getting defined in the stack
        int[] arr1;
        // initialization - here actually object is being created in the heap memory
        arr1 = new int[3];
        System.out.println(arr1[0]);

        // array of the objects
        // array of reference variables
        String[] arr2 = new String[4];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // for every element in the array, print the element
        for(int num : arr1){
            System.out.println(num);
        }

        // print the array using Arrays.toString method
        System.out.println(Arrays.toString(arr1));
    }
}
