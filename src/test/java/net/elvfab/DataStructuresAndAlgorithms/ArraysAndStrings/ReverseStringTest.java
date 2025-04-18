package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        char[] s = {'H', 'e', 'l', 'l', 'o' };

        ReverseString.reverseString(s);

        // assertion
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'H'}, s);
    }

    @Test
    void reverseString1() {
        char[] s = {'H', 'e', 'l', 'l', 'o' };

        ReverseString.reverseString1(s);

        // assertion
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'H'}, s);
    }

    @Test
    void reverseString2() {
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};

        ReverseString.reverseString1(s);

        // assertion
        assertArrayEquals(new char[]{'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'}, s);
    }
}