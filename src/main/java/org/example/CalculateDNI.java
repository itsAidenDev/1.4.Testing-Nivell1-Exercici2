package org.example;

import java.util.Arrays;
import java.util.List;

public class CalculateDNI {
    public static char calculateIDLetter(int idNum) {
        List<Character> letters = Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
                'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                'Q', 'V', 'H', 'L', 'C', 'K', 'E');
        if (idNum < 0 || idNum >= 99999999) {
            throw new IllegalArgumentException("Not valid ID " + idNum);
        }
        int rest = idNum % 23;
        return letters.get(rest);
    }
}