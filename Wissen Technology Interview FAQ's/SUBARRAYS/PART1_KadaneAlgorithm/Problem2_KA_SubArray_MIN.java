//PART1_KadaneAlgorithm/Problem2_KA_SubArray_MIN.java


/*
      Key Points to remember to print minSum with SubArray elements :
      ================================================================
         1. Always update minSum before resetting cs.
         2. Use start and end to track the minSum subarray elements instead of 
            directly using Math.min().
         3. Only update tempStart when cs is reset, so we don’t loose the 
            true start of the subarray.
         4. Ensure correct formatting when printing subarrays.
 */
/* 
Q1) Find the minimum sum of the contiguous subarray using Kadane's Algorithm.
Statement 1 : given array: {3, -4, 2, -3, -1, 7, -5}
              minsum output: -6
              Subarray is {-4, 2, -3, -1} = -6 

Statement 2 : given array: {2, 6, 8, 1, 4}
			  minsum output: 1

Statement 3 : given array: {-1,-3,-6,-2,-5}
			  minsum output: -17


Q2) Can you please debug the code to know how the currentSum and maxSum are changing in each iteration?

OUTPUT :
========


             Index | Current Element | CurrentSum | MinSum | Reset?
            -------------------------------------------------------------
                0                3          3    2147483647   reset to 0
                1               -4         -4             3     No reset
                2                2         -2            -4     No reset
                3               -3         -5            -4     No reset
                4               -1         -6            -5     No reset
                5                7          1            -6   reset to 0
                6               -5         -5            -6     No reset
            
            Min Subarray is { -4, 2, -3, -1  } --> MinSum : -6


*/

package PART1_KadaneAlgorithm;

public class Problem2_KA_SubArray_MIN {
    public static void ka_subArray_MinSum(int arr[]) {
        int cs = 0;
        int minSum = Integer.MAX_VALUE; // +infinity
        int start = 0;
        int end = 0;
        int tempStart = 0;

        // Debuging the code

        // Heading
        System.out.println("\n Index | Current Element | CurrentSum | MinSum | Reset?");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {

            cs += arr[i];

            boolean reset = cs > 0;

            // To check cs is iterating for each element in an array
            System.out.printf("%5d  %15d %10d %13d %12s\n", i, arr[i], cs, minSum, reset ? "reset to 0" : "No reset");

            /*
             * //first update minSum
             * 
             * minSum = Math.min(cs, minSum);
             * 
             */

            /*
             * If you want to print both subarray elements and the minSum value then
             * you should not use Math.min() instead of that
             * you should use start, end, tempStart variables as the subarray indices
             */

            if (cs < minSum) {
                minSum = cs; //update minSum
                start = tempStart;
                end = i;
            }

            // now reset cs

            if (reset) {
                cs = 0;
                tempStart = i + 1;  // Update potential new start index
            }

        }

        System.out.print("\nMin Subarray is { ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i < end ? ", " : " "));

        }
        System.out.println(" } --> MinSum : " + minSum + "\n");
    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
        //int arr[] = {2, 6, 8, 1, 4};
        //int arr[] = {-1,-3,-6,-2,-5};
        ka_subArray_MinSum(arr);
    }
}