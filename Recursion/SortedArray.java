package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 6, 7};
        boolean sorted = sortArray(arr, 0);
        System.out.println(sorted);
    }

    public static boolean sortArray(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortArray(arr, i + 1);
    }
}
