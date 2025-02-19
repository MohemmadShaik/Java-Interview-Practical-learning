

// PART-C output :  Subarray is {-4, 2, -3, -1} = -6  instead of Subarray minSum : -6

/*  

   To print both the subarry elements and the minSum value 
    -------------------------------------------------------
    1. Always update minSum before resetting cs.
    2. Use start and end to track the minSum subarray elements instead of 
       directly using Math.min().
    3. Only update tempStart when cs is reset, so we don’t loose the 
       true start of the subarray.
    4. Ensure correct formatting when printing subarrays.
   
    Keypoint very important : replace the Math.min() with start, end, tempStart varibles.


OUTPUT:
======

            Index | Current Element | currentSum | minSum | reset?
            ----------------------------------------------------------
                0                3            3 2147483647   reset to 0
                1               -4           -4          3     no reset
                2                2           -2         -4     no reset
                3               -3           -5         -4     no reset
                4               -1           -6         -5     no reset
                5                7            1         -6   reset to 0
                6               -5           -5         -6     no reset
            
            Subarray : { -4, 2, -3, -1  } --> minSum : -6

*/
package PART1_KadaneAlgorithm;

public class Problem3_Rivision_KA_SubArray_MIN {
    public static void rivisionSubArray_minSum(int arr[]) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE; // +infinity
        int start =0;
        int end =0;
        int tempStart = 0;

        //heading
        System.out.println("\nIndex | Current Element | currentSum | minSum | reset?");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            boolean reset = currentSum > 0;

            // Before updating minSum trace the currentSum, minSum values

            System.out.printf("%5d %16d %12d %10d %12s\n", i, arr[i], currentSum, minSum,
                    reset ? "reset to 0" : "no reset");

            /* 
                // First update minSum
                minSum = Math.min(currentSum, minSum);
            */

            if(currentSum<minSum){
                minSum = currentSum;
                start = tempStart;
                end = i;
            }

            // second reset the currentSum
            if (reset) {
                currentSum = 0;
                tempStart = i+1; //update new start index
            }
        }

        System.out.print("\nSubarray : { ");
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+(i<end?", ":" "));
        }
        System.out.println(" } --> minSum : "+minSum+"\n");
    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
        rivisionSubArray_minSum(arr);
    }
}