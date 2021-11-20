package recursions;

public class AllPossibleStrings {
    public static void run (char[] chars, int k) {
       generateStrings(chars, "", k);
    }

    private static void generateStrings(char[] chars, String prefix, int k) {
      if(k == 0) {
          System.out.println(prefix);
          return;
      }

      for (int i= 0; i < chars.length ; i++) {
          String newPrefix = prefix + chars[i];
          generateStrings(chars, newPrefix, k -1);
      }
    }
}
