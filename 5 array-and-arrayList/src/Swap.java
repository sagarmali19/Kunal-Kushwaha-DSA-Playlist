import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
        int[] reversedArr = reverseArr(arr);
        System.out.println(Arrays.toString(reversedArr));
    }

    private static int[] reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start++, end--);
        }
        return arr;
    }

    public static void swap(int[] arr, int firstIndx, int secondIndx){
        int temp = arr[firstIndx];
        arr[firstIndx] = arr[secondIndx];
        arr[secondIndx] = temp;
    }
}
