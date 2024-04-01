public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = findMax(arr);
        System.out.println(max);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
