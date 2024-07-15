package Recursion;

public class FindIndexNumberOfTarget {
    public static void main(String args[]){
        int[] arr = {1,8,3,9,8,1,8};
        findTarget(arr,0);
    }
    public static void findTarget(int[] arr,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == 8){
            System.out.print(i+" ");
        }
        findTarget(arr, i+1);
    }
}
