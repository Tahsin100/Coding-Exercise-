public class PassingCars {
    public void run () {
        int[] A = new int[]{0, 1, 0, 1, 1};
        long countZero = 0;
        long passingCars = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                countZero++;
            } else if(A[i] == 1) {
                passingCars += countZero;
            }
        }
        if(passingCars > 1000000000)

        System.out.println(passingCars);

    }
}
