package Recursion;

public class MaximuminArray {
    public static void main(String args[]){
        int[] arr = {0, 1, 3, 7, 4, 2};
        int max = maxElement(arr, 0, arr[0]);
        System.out.println(max);
    }

    public static int maxElement(int[] arr, int i, int max){
        if(i == arr.length){
            return max;
        }
        if(max < arr[i]){
            max = arr[i];
        }
        return maxElement(arr, i + 1, max);
    }
}