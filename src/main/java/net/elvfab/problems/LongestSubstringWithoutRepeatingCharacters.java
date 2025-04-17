package net.elvfab.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    // worst case O(n^2) ?
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int longestCounter = 0;
        int currentCounter = 0;
        char[] stringArray = s.toCharArray();

        for (int i = 0; i < stringArray.length; i++) {
            if (map.containsKey(stringArray[i])) {
                longestCounter = Math.max(longestCounter, currentCounter);
                currentCounter = 0;
                i = map.get(stringArray[i]);
                map = new HashMap<Character, Integer>();
            } else {
                currentCounter++;
                map.put(stringArray[i], i);
            }
        }

        return Math.max(currentCounter, longestCounter);
    }

    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (map.containsKey(current) && map.get(current) >= start){
                start = map.get(current) + 1;
            }

            map.put(current, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
