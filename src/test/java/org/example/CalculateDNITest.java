package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class CalculateDNITest {

    @ParameterizedTest
    @CsvSource({
            "24473728, R",
            "94326824, M",
            "38493465, U",
            "56828013, J",
            "49621034, F",
            "56248201, E",
            "48852045, S",
            "85347201, D"
    })
    void calculateLetterTest(int dni, char expectedLetter) {
        char letter = CalculateDNI.calculateIDLetter(dni);
        assertEquals(expectedLetter, letter);

    }

    @Test
    void testInvalidDniNumbers() {
        try {
            CalculateDNI.calculateIDLetter(-1);
            fail("IllegalArgumentException expected for negative ID.");
        } catch (IllegalArgumentException e) {
            assertEquals("Not valid ID -1", e.getMessage(), "Exception message doesn't " +
                    "match for negative ID.");
        }

        try {
            CalculateDNI.calculateIDLetter(100000000);
            fail("IllegalArgumentException expected for too large ID number.");
        } catch (IllegalArgumentException e) {
            assertEquals("Not valid ID 100000000", e.getMessage(), "Exception message doesn't " +
                    "match for too large ID number");
        }
    }
}
