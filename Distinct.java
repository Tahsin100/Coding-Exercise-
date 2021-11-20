import java.lang.reflect.Array;
import java.util.Arrays;

public class Distinct {
    public static int run(int A[]) {
        int distinctCount = 0;

        if(A.length == 0)
            return distinctCount;

        Arrays.sort(A);

        int currentVal = -1000000;
        for (int i =0 ; i < A.length ; i++) {
            if(A[i] > currentVal) {
                currentVal = A[i];
                distinctCount++;
            }
        }

        return distinctCount;
    }

}
