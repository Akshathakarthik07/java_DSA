package Recursion;

public class ArrayPrint {
    public static void main(String args[]){
        int[] arr = {1, 3, 5, 10, 15};
        printArr(arr, 0);
    }

    public static void printArr(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArr(arr, i + 1);
    }
}
