import java.util.ArrayList;
import java.util.Arrays;


public class MaxProductOfThree {
    public static int run(int A[]) {
        int maxProd = 0;

        if(A.length < 3) {
            return maxProd;
        }
        int l = A.length;
        Arrays.sort(A);

        int smallestNegetives = -1;

        maxProd = A[l -1] * A[l-2] * A[l-3];

        if(A[0] < 0 && A[1] <0) {
            smallestNegetives = A[0] * A[1];
        }

        int rearTriplet = smallestNegetives * A[l-1];

        if(rearTriplet > maxProd)
            maxProd = rearTriplet;

        return maxProd;
    }
}
