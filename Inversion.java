public class Inversion {
    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 4, 5};
        //Print the number of inversions
        System.out.println(countInversions(arr));
    }

    public static int countInversions(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        //Return the total number of inversions
        return count;
    }
} 
    

