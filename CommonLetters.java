import java.util.HashMap;
import java.util.Map;

public class CommonLetters {
    public CommonLetters() {
        String[] input = new String[]{"Asdasd", "askdhja", "iwursiua"};
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String unique = uniqueString(input[i].toLowerCase());
            for (int j= 0; j < unique.length() ; j++) {
                char letter = input[i].charAt(j);
                if(!letterCount.containsKey(letter)){
                    letterCount.put(letter, i);
                } else {
                    int currVal = letterCount.get(letter);
                    letterCount.put(letter, currVal+i);
                }
            }
        }

        int presentInAll = 0;
        for (Map.Entry<Character, Integer> item : letterCount.entrySet()) {
            int value = item.getValue();
            if(value == 3)
                presentInAll++;
        }
        System.out.println(presentInAll);
    }

    private String uniqueString(String rawString){
        String unique = "";
        for (int i= 0; i< rawString.length(); i++){
            Character rawChar = rawString.charAt(i);
            if(!unique.contains(rawChar.toString())) {
                unique +=rawChar;
            }
        }
        return unique;
    }
}
