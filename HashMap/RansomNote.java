package HashMap;

import java.util.HashMap;

public class RansomNote {
    static HashMap<Character, Integer> hash = new HashMap<>();

    public static boolean check(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!hash.containsKey(ch)) {
                hash.put(ch, 1);
            } else {
                hash.put(ch, hash.get(ch) + 1);
            }
        }
        for (int j = 0; j < str2.length(); j++) {
            char chr = str2.charAt(j);
            if (hash.containsKey(chr)) {
                hash.put(chr, hash.get(chr) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String mag = "happy and sad evening and lightly";
        String note = "help";
        boolean ans = check(mag, note);
        System.out.println(ans);
    }
}
