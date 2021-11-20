package Algos;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static int run(int A[]) {
        int intersections = 0;

        int l = A.length;

        if(l == 0)
            return intersections;
        int[] refinedA = new int[l];

        for (int i = 0 ; i < l ; i++) {
            refinedA[i] = A[i] + i ;
        }
        Arrays.sort(refinedA);

        int currentMin = refinedA[l-1];
        for (int i = l-1 ; i > 0; i--) {
            if(refinedA[i-1] > currentMin) {
                intersections += i;
                currentMin = refinedA[i-1];
            } 
        }

        if(intersections > 10000000)
            return -1;
        return intersections;
    }
}
