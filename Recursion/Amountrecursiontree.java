package Recursion;

public class Amountrecursiontree {
    static int count = 0;
    public static void path(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            count++;
            return;
        }
        if(curr>end){
            return;
        }
        path(curr+1,end,ans+1);
        path(curr+2,end,ans+2);
        path(curr+3,end,ans+3);
    }
    public static void main(String args[]){
        path(0,3,"");
        System.out.println(count);
    }
}
