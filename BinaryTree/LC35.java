package BinaryTree;
import java.util.*;
public class LC35 {

        public static int check1(int[] arr,int target){

            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    System.out.println(i);
                    return i;
                }
            }
            return 2;
        }
        public static void main(String args[]){
            int[] arr={1,3,5,6,8};
            int target=7;
            int count=0;
            int ans= check1(arr,target);
            int front=0;
            if(ans==2){
                for(int j=0;j<arr.length-1;j++){
                    if(arr[j]<target){
                        front=j;
                    }
                }
                System.out.println(front+1);
            }
        }
    }

