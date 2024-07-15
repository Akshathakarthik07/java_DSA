package SortingAlgorithms;

public class MergeSorting {
    public static void main(String[] args){
        int[] arr = {10,5,20,30,15,70,60,40};
        int[] result = mergeSort(arr,0,arr.length-1);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] mergeSort(int[] arr, int low, int high){
        if(low == high){
            int br[] = new int[1];
            br[0] = arr[low];
            return br;
        }
        int mid = (low+high)/2;
        int[] fh = mergeSort(arr,low,mid);
        int[] sh = mergeSort(arr,mid+1,high);
        int[] result = mergingTwoSortedArray(fh,sh);
        return result;
    }
    public static int[] mergingTwoSortedArray(int[] fh, int[] sh){
        int i=0, j=0,k=0;
        int[] merged = new int[fh.length+ sh.length];
        while (i< fh.length && j< sh.length){
            if(fh[i]<sh[j]){
               merged [k] = fh[i];
                i++;
            }
            else{
                merged[k] = sh[j];
                j++;
            }
            k++;
        }
        while (i< fh.length){
            merged[k] = fh[i];
            i++;
            k++;
        }
        while (j< sh.length){
            merged[k] = sh[j];
            j++;
            k++;
        }
        return merged;
    }
}
