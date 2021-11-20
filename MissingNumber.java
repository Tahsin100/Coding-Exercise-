public class MissingNumber {

    public MissingNumber() {

        int[] A = new int[]{1, 5, 4, 3, 2, 8, 9, 10, 6};
        int N = A.length + 1;
        int total = (N * (N + 1)) / 2;
        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }
        System.out.println(total);
    }
}
