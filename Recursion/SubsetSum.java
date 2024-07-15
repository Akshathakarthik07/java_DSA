package Recursion;

public class SubsetSum {
    public static void findSubset(int[] arr,int i, String set, int sum_so_far, int tar){
        if(tar==sum_so_far){
            System.out.println(set);
            return;
        }
        if(i== arr.length){
            return;
        }
        if(sum_so_far>tar){
            return;
        }
        findSubset(arr,i+1,set+arr[i]+" ",sum_so_far+arr[i],tar);
        findSubset(arr,i+1,set,sum_so_far,tar);
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,8};
        int targetSum = 12;
        findSubset(arr,0," ",0,targetSum);
    }

}
