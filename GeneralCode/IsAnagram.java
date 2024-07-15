package GeneralCode;
import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        if(checkAnagram(str1,str2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }

    public static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}