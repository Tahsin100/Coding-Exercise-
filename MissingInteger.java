import java.util.ArrayList;
import java.util.Arrays;

public class MissingInteger {
    public MissingInteger() {
        int[] A = new int[]{-1, -3};
        Arrays.sort(A);
        int missingInt = 1;
        for (int i=0 ; i<A.length ; i++) {
            if (A[i] == missingInt)
                missingInt++;
        }
        System.out.print(missingInt);
    }
}
