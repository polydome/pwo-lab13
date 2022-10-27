package pwo.lab13;

import java.util.regex.Pattern;

public class Text {
    private static final Pattern digitPattern = Pattern.compile("\\d");

    static boolean cont5Dig(String str){
        return str.replaceAll("[^0-9]", "").length()==5;
    }

    static int countDigits(String str) {
        return (int) digitPattern.matcher(str).results().count();
    }

    static boolean containsDigits(String str) {
        return countDigits(str) > 0;
    }

    static boolean containsDigitsOnly(String str) {
        return countDigits(str) == str.length();
    }
}