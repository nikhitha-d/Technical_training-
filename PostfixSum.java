public class PostfixSum {
    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};
        // Calculate and store the postfix sum array
        int[] postfixSum = calculatePostfixSum(fuel);
        System.out.println(java.util.Arrays.toString(postfixSum));
    }

    public static int[] calculatePostfixSum(int[] fuel) {
        int n = fuel.length;
        int[] postfixSum = new int[n];
        postfixSum[n - 1] = fuel[n - 1];
         // Calculate the postfix sum
        for (int i = n - 2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i + 1] + fuel[i];
        }
         // Return the calculated postfix sum array
        return postfixSum;
    }
}

