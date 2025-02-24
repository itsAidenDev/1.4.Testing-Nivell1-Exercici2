package org.example;

public class CalculateDNI {
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateIDLetter(int idNum) {
        if (idNum < 0 || idNum >= 99999999) {
            throw new IllegalArgumentException("Not valid ID: " + idNum);
        }
        return LETTERS.charAt(idNum % 23);
    }
}
