package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

public class ReverseString {

    public static void reverseString(char[] s) {
        int end = s.length - 1;
        for (int i = 0; i < (s.length) / 2; i++){
            char tmp = s[i];
            s[i] = s[end];
            s[end] = tmp;
            end--;
        }
    }

    // bit math
    // a = 'x' -> 120 -> 1111000
    // b = 'y' -> 121 -> 1111001
    // tmp = a xor b -> 0000001
    // a = b -> 1111001
    // b = a xor tmp -> 1111000
    public static void reverseString1(char[] s) {
        int end = s.length - 1;
        for (int i = 0; i < (s.length) / 2; i++){
            int tmp = s[i] ^ s[end];
            s[i] = s[end];
            s[end] = (char) ((int) s[i] ^ tmp);

            end--;
        }
    }
}
