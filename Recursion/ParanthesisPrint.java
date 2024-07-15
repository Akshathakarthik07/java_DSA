package Recursion;

public class ParanthesisPrint {
    public static void paranthesis(String ans, int open,int close,int n){
        if(open==n&&close==n){
            System.out.println(ans);
            return;
        }
        if(open>n||close>n){
            return;
        }
        paranthesis(ans+"(",open+1,close,n);
        if(close<open){
            paranthesis(ans+")",open,close+1,n);
        }
    }
    public static void main(String args[]){
        paranthesis("",0,0,3);
    }
}
