package Algos;

public class MergeSort {

    public static int[] run (int[] A) {
        if(A.length < 2)
            return A;
        int length = A.length;
        int mid = (length /2);

        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i=0 ; i< mid; i++)
            left[i] = A[i];

        for (int j = 0 ; j < length-mid ; j++)
            right[j] = A[mid+j];

        run(left);
        run(right);
        A = merge(A, left, right);

        return A;
    }

    private static int[] merge(int[] A, int[] left, int[] right) {
        int i = 0;
        int j =0;
        int k =0;

        int l = left.length;
        int r = right.length;

        while (i < l && j < r) {
            if(left[i] <= right[j]) {
                A[k] = left[i];
                i++;
            } else {
                A[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < l) {
            A[k] = left[i];
            i++;
            k++;
        }

        while (j < r) {
            A[k] = right[j];
            j++;
            k++;
        }

        return A;
    }
}
