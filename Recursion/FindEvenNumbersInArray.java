package Recursion;

public class FindEvenNumbersInArray {
    public static void main(String args[]){
        int [] arr = {2,7,4,6,9,10};
        evenNumbers(arr, 0);
    }
    public static void evenNumbers(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i]%2 == 0) {
            System.out.println(arr[i]);
        }
        evenNumbers(arr,i+1);
    }
}
