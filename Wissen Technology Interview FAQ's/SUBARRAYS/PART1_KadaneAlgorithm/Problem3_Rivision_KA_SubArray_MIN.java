//PART-B : Adding heading to the minSum of subarray and also updating minSum trace the currentSum, minSum values.

package PART1_KadaneAlgorithm;

public class Problem3_Rivision_KA_SubArray_MIN {
    public static void rivisionSubArray_minSum(int arr[]) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE; // +infinity

        //heading
        System.out.println("\nIndex | Current Element | currentSum | minSum | reset?");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            boolean reset = currentSum > 0;

            // Before updating minSum trace the currentSum, minSum values

            System.out.printf("%5d %16d %12d %10d %12s\n", i, arr[i], currentSum, minSum,
                    reset ? "reset to 0" : "no reset");

            // First update minSum
            minSum = Math.min(currentSum, minSum);

            // second reset the currentSum
            if (reset) {
                currentSum = 0;
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("\nSubarray minSum : " + minSum + "\n");
    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
        rivisionSubArray_minSum(arr);
    }
}