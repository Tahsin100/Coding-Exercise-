import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryFreq {

    public BinaryFreq () {
        Scanner scnObj = new Scanner(System.in);
        System.out.println("Enter an integer value:");

        String userInput = scnObj.nextLine();
        /* int intValue = Integer.parseInt(userInput);
        CharSequence binaryChars = Integer.toBinaryString(intValue);*/
        String REGX = "10+1|0+1";
        Pattern pattern = Pattern.compile(REGX);
        Matcher matcher = pattern.matcher(userInput);

        ArrayList matchedList = new ArrayList<String>();
        Boolean isFirst = true;
        while (matcher.find()) {
            if(isFirst) {
                if(matcher.group().startsWith("0")) {
                    continue;
                }
                isFirst = false;
            }
            matchedList.add(matcher.group());
        }

        int binaryZeroLength = 0;
        for (int i = 0 ; i < matchedList.size() ; i++) {
            String subString = matchedList.get(i).toString() ;
            Pattern pattern1 = Pattern.compile("0+");
            Matcher matcher1 = pattern1.matcher(subString);
            String currentLength = "";
            if(matcher1.find()) {
                currentLength = matcher1.group();
            }
            if(currentLength.length() > binaryZeroLength) {
                binaryZeroLength = currentLength.length();
            }
        }

        System.out.println("Longest Sequence is->" + (binaryZeroLength));
    }
}
