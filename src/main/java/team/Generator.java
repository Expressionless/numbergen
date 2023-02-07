package team;

import java.util.Random;

public class Generator {

    /**
     * 10 characters
     * 1 - 3 uppercase characters
     * 1 - 3 special characters
     * 2 - 4 numbers
     * the rest lowercase characters
     */

     private static final char[] SPECIAL_CHARACTERS = {'!', '@', '#', '$'};
    

    private final int upperLength;
    private final int lowerLength;
    private final int specialLength;
    private final int numberLength;

    public Generator(int lowerlength, int upperLength, int specialLength, int numberLength) {
        this.lowerLength = lowerlength;
        this.upperLength = upperLength;
        this.specialLength = specialLength;
        this.numberLength = numberLength;
    }

    public int getTotalLength() {
        return lowerLength + upperLength + specialLength + numberLength;
    }

    private char generateCharacter(char endChar, char startChar) {
        int range = endChar - startChar;
        return Character.valueOf((char)(new Random().nextInt(range) + startChar));
    }

    public String generate() {
        return "";
    }

}
