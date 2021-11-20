public class CountDiv {
    public static int run(int A, int B, int K) {
        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }
}
