package SortingAlgorithms;

public class MergingOfTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {10,40,50,60,80,90,100};
        int[] arr2 = {20,30,70};
        int[] sort = new int[arr1.length+arr2.length];
        int i=0, j=0,k=0;
        while (i< arr1.length&&j< arr2.length){
            if(arr1[i]<arr2[j]){
                sort[k] = arr1[i];
                i++;
            }
            else{
                sort[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i< arr1.length){
            sort[k] = arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            sort[k] = arr1[j];
            j++;
            k++;
        }
        for(int l=0;l<sort.length;l++){
                System.out.print(sort[l]+" ");
        }
    }
}
