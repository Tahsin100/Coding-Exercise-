public  class PrefixSum {
    public static void run() {
        int[] nums = new int[]{3, 2, 5, 6, 1, 5, 4};

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for (int i = 0; i < prefixSum.length ; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }

}
