/* Problem1_1_KA_SubArray is the same as PART1_KadaneAlgorithm/Problem1_KA_SubArray.java
but with the debug info added to the output.

OUTPUT:
======
        Index | Current Element | Current Sum |    Max Sum  | Reset Current Sum?
        -----------------------------------------------------------------------------
            0 |               3 |           3 | -2147483648 |                NO
            1 |              -4 |          -1 |           3 |        reset to 0
            2 |               2 |           2 |           3 |                NO
            3 |              -3 |          -1 |           3 |        reset to 0
            4 |              -1 |          -1 |           3 |        reset to 0
            5 |               7 |           7 |           3 |                NO
            6 |              -5 |           2 |           7 |                NO
        
        MaxSum Subarray: { 7 } ---> MaxSum: 7

*/

package PART1_KadaneAlgorithm;


class Problem1_1_KA_SubArray_MAX {
    public static void maxSum_part1(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // -ve infinity
        int start = 0, end = 0, tempStart = 0; // Track subarray indices

        System.out.println("Index | Current Element | Current Sum |    Max Sum  | Reset Current Sum?");
        System.out.println("-----------------------------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Check if currentSum is going to be reset
            boolean isReset = currentSum < 0;

            // Print debug info before updating maxSum
            System.out.printf("%5d | %15d | %11d | %11d | %17s\n", 
                              i, arr[i], currentSum, maxSum, isReset ? "reset to 0" : "NO");

            // If we found a new maxSum, update start & end indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            // If currentSum goes negative, reset it and mark a new subarray start
            if (isReset) {
                currentSum = 0;
                tempStart = i + 1; // New start index
            }
        }

        // Print the max sum and the corresponding subarray
        System.out.print("\nMaxSum Subarray: { ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i < end ? ", " : " "));
        }
        System.out.println("} ---> MaxSum: " + maxSum + "\n");
    }

    public static void main(String[] args) {
         int arr[] = {3, -4, 2, -3, -1, 7, -5};
        //int arr[] = {2, 6, 8, 1, 4};
        //int arr[] = {-1,-3,-6,-2,-5};
        maxSum_part1(arr);
    }
}