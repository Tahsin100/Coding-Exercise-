package recursions;

public class Atoi {
    public static void run(String input) {
        int multiply = 1;
        int pos = 0;
        if(input.charAt(0) == '-') {
            multiply = -1;
            pos = 1;
        }
        int sum = generateInt(input, 0, pos);
        System.out.println(sum*multiply);
    }

    private static int generateInt(String input, int sum, int pos) {
        if(pos > input.length()-1) {
           return sum;
        }
        int newSum;
        if(Character.isDigit(input.charAt(pos)))
             newSum = (int) (Math.pow(10, ((input.length()-1) - pos)) * Character.getNumericValue(input.charAt(pos))) + sum;
        else {
            return -1;
        }
        pos++;
        return generateInt(input, newSum, pos);
    }
}
