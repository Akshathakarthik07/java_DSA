package HashMap;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "anagram";
        System.out.println(anagram(s1,s2));
    }
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            if (!hm.containsKey(a)) {
                hm.put(a, 1);
            }
            else {
                hm.put(a, hm.get(a) + 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            if (hm.containsKey(a)) {
                if (hm.get(a) == 1) {
                    hm.remove(a);
                }
                else {
                    hm.put(a, hm.get(a) - 1);
                }
            }
            else{
                return false;
            }
        }
        return hm.isEmpty();
    }
}
