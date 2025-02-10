public class PrefixSum {
        public static void main(String[] args) {
            int[] sales = {10, 20, 15, 30, 25};
            //Calculate and store the prefix sum array
            int[] prefixSum = calculatePrefixSum(sales);
            // Print the prefix sum array
            System.out.println(java.util.Arrays.toString(prefixSum));
        }
    
        public static int[] calculatePrefixSum(int[] sales) {
            int[] prefixSum = new int[sales.length];
            prefixSum[0] = sales[0];
            for (int i = 1; i < sales.length; i++) {
                //Calculate the prefix sum 
                prefixSum[i] = prefixSum[i - 1] + sales[i];
            }
            // Return the calculated prefix sum array
            return prefixSum;
        }
    }
    
    

