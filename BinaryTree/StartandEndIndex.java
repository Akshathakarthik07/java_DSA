package BinaryTree;
import java.util.*;
public class StartandEndIndex {
        public static void main(String[] args){
            int[] arr = {5,7,7,8,8,10};
            int target = 8;
            findTarget(arr,0,0, target);
        }
        public static void findTarget(int[] arr,int i,int j,int target){

            for(i = 0;i< arr.length;i++) {
                if (arr[i] == target) {
                    int start = arr[i];
                    System.out.print("["+i);
                    break;
                }
            }

            for(j = arr.length-1;j>=0;j--){
                if(arr[j] == target){
                    int end = arr[j];
                    System.out.print(","+j+"]");
                    break;

                }
            }
        }
    }

