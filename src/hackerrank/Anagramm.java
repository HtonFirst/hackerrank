package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagramm {

    static boolean isAnagram(String a, String b) {

        char[] aChars = a.toUpperCase().toCharArray();
        Arrays.sort(aChars);


        char[] bChars = b.toUpperCase().toCharArray();
        Arrays.sort(bChars);

        return Arrays.compare(aChars, bChars)==0;


        }






    public static void main(String[] args) {
        System.out.println(Anagramm.isAnagram("anagram", "margana"));

    }
}
