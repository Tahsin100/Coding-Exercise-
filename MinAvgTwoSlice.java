public class MinAvgTwoSlice {
    public static void run() {
        int[] A = new int[]{-3, -5, -8, -4, -10};

        int result = 0;

        double minVal = (A[0] + A[1]) /2.0 ;

        for (int i = 0; i < A.length -2 ; i++) {
            double avg = (A[i] + A[i+1] + A[i+2]) / 3.0;
            if (avg < minVal) {
                minVal = avg;
                result = i;
            }
        }

        for (int i = 0; i < A.length - 1 ; i++) {
            double avg = (A[i] + A[i+1]) / 2.0;
            if (avg < minVal) {
                minVal = avg;
                result = i;
            }
        }

        int avg = (A[A.length-2] + A[A.length-1]) / 2;
        if (avg < minVal) {
            minVal = avg;
            result = A.length-2;
        }
        System.out.println(result);
    }
}
