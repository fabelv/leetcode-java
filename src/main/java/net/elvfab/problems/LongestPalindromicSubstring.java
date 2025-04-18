package net.elvfab.problems;

public class LongestPalindromicSubstring {

    // O(n^3)
    public static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                String substring = s.substring(i,j+1);
                if (isPalindrome(substring)){
                    if (substring.length() > longest.length()){
                        longest = substring;
                    }
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String s) {

        if (s.length() == 1) return true;

        char[] stringArray = s.toCharArray();

        for (int i = 0; i < stringArray.length / 2; i++) {
            if (stringArray[i] != stringArray[stringArray.length - 1 - i]){
                return false;
            }
        }

        return true;
    }

    public static String longestPalindrome2(String s) {
        String longest = "";
        char[] stringArray = s.toCharArray();
        int center = (stringArray.length / 2) -1;

        for (int i = 0; i < center; i++){
            int left = center - i - 1;
            int right = center + i + 1;

            if (stringArray[left] == stringArray[right]){
                longest = s.substring(left, right + 1);
            }
        }

        return longest;
    }
}
