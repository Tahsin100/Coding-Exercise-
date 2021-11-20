public class CyclicRotation {

    public CyclicRotation () {
        int[] A = new int[]{1, 2, 3, 4, 0, 0, -5};
        int repeat = 0;
        int K = 15;
        while (repeat < K) {
            if(A.length > 1) {
                int last = A[A.length-1];
                for (int i = A.length - 2; i >= 0; i--) {
                    A[i+1] = A[i];
                }
                A[0] = last;
                for (int j = 0; j < A.length; j++)
                    System.out.print(A[j] + ", ");
                System.out.println();
            }
            repeat++;
        }
    }
}
