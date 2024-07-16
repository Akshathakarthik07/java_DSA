package JPQP;

import java.util.HashSet;

public class RemoveCharacterToformJuspay {

    static HashSet<Character> hash = new HashSet<>();

    public static int check(String str) {
        hash.add('j');
        hash.add('u');
        hash.add('s');
        hash.add('p');
        hash.add('a');
        hash.add('y');

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!hash.contains(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hellojuiuhqispaniuwqy";
        int ans = check(str);
        System.out.println(ans);
    }
}