package net.elvfab.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        String s = "babad";

        String res = LongestPalindromicSubstring.longestPalindrome(s);

        // assertion
        assertEquals("bab", res);
    }

    @Test
    void longestPalindrome2() {
        String s = "cbbd";

        String res = LongestPalindromicSubstring.longestPalindrome(s);

        // assertion
        assertEquals("bb", res);
    }


    @Test
    void longestPalindrome3() {
        String s = "a";

        String res = LongestPalindromicSubstring.longestPalindrome(s);

        // assertion
        assertEquals("a", res);
    }


    @Test
    void longestPalindrome1() {
        String s = "babad";

        String res = LongestPalindromicSubstring.longestPalindrome2(s);

        // assertion
        assertEquals("bab", res);
    }

    @Test
    void longestPalindrome22() {
        String s = "cbbd";

        String res = LongestPalindromicSubstring.longestPalindrome2(s);

        // assertion
        assertEquals("bb", res);
    }


    @Test
    void longestPalindrome33() {
        String s = "a";

        String res = LongestPalindromicSubstring.longestPalindrome2(s);

        // assertion
        assertEquals("a", res);
    }
}