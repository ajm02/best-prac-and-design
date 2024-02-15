package design_patterns.strategy_pattern_exercise;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CaeserCipher implements CipherStrategy {

    @Override
    public String encode(String input) {
        /*
        implement a caesar cipher here - where letters are shifted along x number of values in alphabet
        x can be whatever you like
        If you go beyond the end of the alphabet, you should wrap back around to the front
        e.g. 'z' on a cipher with a shift of 2 should become 'b'
         */
        Random generator = new Random();
        int shift = generator.nextInt(25) + 1;
        String encodedString = "";
        for (char c : input.toCharArray()) {
            int newCharAscii = 0;
            if (Character.isUpperCase(c)) {
                newCharAscii = 65 + (((((int) c) + shift) - 65) % 26);
            }

            if (Character.isLowerCase(c)) {
                newCharAscii = 97 + (((((int) c) + shift) - 97) % 26);
            }

            if (!Character.isAlphabetic(c)) {
                newCharAscii = c;
            }

            encodedString += (char) newCharAscii;
        }

        return encodedString;
    }
}
