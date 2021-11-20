package Algos;

import java.util.ArrayList;

public class InvertString {
    public static void run(String blah) {
        System.out.print(recursiveFunc(blah));
    }

    private static String recursiveFunc(String blah) {
        if(blah.length() <= 1)
            return blah;
        return recursiveFunc(blah.substring(1)) + blah.charAt(0);
    }
}
