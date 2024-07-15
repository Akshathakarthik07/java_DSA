package GeneralCode;
import java.util.*;
public class IsPalindromeofString {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        String str = removeNonAlphanumeric(s);
        boolean palin = isPalindrome(str,0, str.length()-1);
        System.out.println(palin);
    }
    public static String removeNonAlphanumeric(String s) {
        StringBuilder result = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                result.append(Character.toLowerCase(character));
            }
        }
        return result.toString();
    }
    public static boolean isPalindrome(String str, int left, int right){
        if(left>right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return isPalindrome(str,left+1,right-1);
    }
}
