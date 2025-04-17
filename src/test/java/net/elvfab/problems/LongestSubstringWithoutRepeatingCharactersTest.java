package net.elvfab.problems;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // assertion
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "pwwkew";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // assertion
        assertEquals(3, result);
    }


    @Test
    void lengthOfLongestSubstring3() {
        String s = "aab";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // assertion
        assertEquals(2, result);
    }


    @Test
    void lengthOfLongestSubstring4() {
        String s = "dvdf";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // assertion
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring11() {
        String s = "abcabcbb";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(s);

        // assertion
        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring22() {
        String s = "pwwkew";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(s);

        // assertion
        assertEquals(3, result);
    }


    @Test
    void lengthOfLongestSubstring33() {
        String s = "aab";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(s);

        // assertion
        assertEquals(2, result);
    }


    @Test
    void lengthOfLongestSubstring44() {
        String s = "dvdf";

        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(s);

        // assertion
        assertEquals(3, result);
    }
}