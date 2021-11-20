import java.util.OptionalInt;

public class GenomicRangeQuery {

    int[][] lastOccurrencesMap;
    public void run() {
        String S = "CAGCCTA";

        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};

        int N = S.length();
        int M = P.length;

        int[] result = new int[M];
        lastOccurrencesMap = new int[3][N+1];

        int a = 0;
        int b = 0;
        int c = 0;

        lastOccurrencesMap[0][0] = a ;
        lastOccurrencesMap[1][0] = b ;
        lastOccurrencesMap[2][0] = c ;

        for (int i = 1; i < N; i++) {
            char ch = S.charAt(i);
            a= 0;
            b= 0;
            c= 0;

            if (ch == 'A') {
                a = i;
            } else if (ch == 'C') {
                b = i;
            } else if (ch == 'G') {
                c = i;
            }
            lastOccurrencesMap[0][i] = a + lastOccurrencesMap[0][i-1];
            lastOccurrencesMap[1][i] = b + lastOccurrencesMap[1][i-1];
            lastOccurrencesMap[2][i] = c + lastOccurrencesMap[2][i-1];
        }

        for (int i = 0; i < M; i++) {
            int startIndex = P[i];
            int endIndex = Q[i] + 1;

            if(lastOccurrencesMap[0][endIndex] - lastOccurrencesMap[0][startIndex] > 0)
                result[i] = 1;
            else if(lastOccurrencesMap[1][endIndex] - lastOccurrencesMap[1][startIndex] > 0)
                result[i] = 2;
            else if(lastOccurrencesMap[2][endIndex] - lastOccurrencesMap[2][startIndex] > 0)
                result[i] = 3;
            else
                result[i] = 4;
        }

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + ",");
        }
    }

}
