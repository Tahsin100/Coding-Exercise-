public class Problem1 {

    public static void run(int n) {
        int sum = 0;
        int sum2 = 0;

        sum += n*((n* (n+1)) / 2);
        for(int i =1 ; i < n ; i++) {
            sum2 += i*(i+1)/ 2;
        }
        System.out.println("Sum->" + (sum -sum2));
    }
}
