package Recursion;

public class PalindromeorNot {
    public static void main(String args[]){
        String str = "malayalam";
        boolean palin = palindrome(str,0, str.length()-1);
        System.out.println(palin);

    }
    public static boolean palindrome(String str, int left, int right){
        if(left>right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return palindrome(str,left+1,right-1);
    }
}
