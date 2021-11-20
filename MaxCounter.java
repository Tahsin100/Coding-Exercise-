public class MaxCounter {

    int N = 5;

    public MaxCounter() {
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] result = new int[N];
        int maxCount = 0;
        int lastMax = 0;

        for (int i = 0; i<A.length ; i++) {
            if(A[i] >= 1 && A[i] <= N) {
                if(result[A[i]-1] < lastMax)
                    result[A[i]-1] = lastMax+1;
                else
                    result[A[i]-1] += 1;

                if(result[A[i] - 1] > maxCount)
                    maxCount = result[A[i]-1];
            }
            else if (A[i] == N +1) {
                lastMax = maxCount;
            }
        }

        String del = ", ";
        for (int i = 0; i <result.length ; i++) {
            if(i != result.length)
                del = "";
            if(result[i] < lastMax)
                result[i] = lastMax;
            System.out.print(result[i] + del);
        }
    }

}
