package recursions;

public class CheckIfPalindrome {
    public static void run (int input) {
        int inverse = Integer.parseInt(getInverseNumber(String.valueOf(input)));
        if(inverse == input) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

    private static String getInverseNumber(String inputS) {
        if(inputS.length() <= 1) {
            return inputS;
        }
        return getInverseNumber(inputS.substring(1)) + inputS.charAt(0);
    }
}
