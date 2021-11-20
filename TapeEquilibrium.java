
public class TapeEquilibrium {
    public TapeEquilibrium() {
        int[] A = new int[]{3, 1, 2, 4, 3};
        int total = 0;
        for (int i = 0 ; i < A.length ; i++) {
            total += A[i];
        }

        int leftHalf = 0;
        int rightHalf = 0;
        int minDiff = 100000;
        for (int i = 1 ; i < A.length ; i++) {
            leftHalf += A[i-1];
            rightHalf = total - leftHalf;
            int diff = Math.abs(leftHalf - rightHalf);
            if(diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println(minDiff);
    }
}
