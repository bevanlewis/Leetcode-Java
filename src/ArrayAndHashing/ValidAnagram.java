package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    // Create 2 hashmaps and check if they are equal 
    // The hashmaps will store the frequency of the characters in both the strings.
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), 1 + mapS.getOrDefault(s.charAt(i), 0));
            mapT.put(t.charAt(i), 1 + mapT.getOrDefault(t.charAt(i), 0));
        }

        return mapS.equals(mapT);
    }
    
    // slightly better solution
    // Use a single hashmap that counts up for all the values in s
    // and counts down for all the characters in s
    // finally check if the hashmap has non zero values.
    public boolean isAnagram2(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        // Faster to use the below foreach loop rather than fori loop
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }


        // for (int i = 0; i < s.length(); i++) {
        //     count.put(s.charAt(i), 1 + count.getOrDefault(s.charAt(i), 0));
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        // }

        for (int i:
             count.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }


    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] anagS = s.toCharArray();
        char[] anagT = t.toCharArray();
        Arrays.sort(anagS);
        Arrays.sort(anagT);
        for (int i = 0; i < anagS.length; i++) {
            if (anagS[i] != anagT[i]) {
                return false;
            }
        }
        return true;
    }
}
