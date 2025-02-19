

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

*/
package PART1_KadaneAlgorithm;

public class Problem3_Rivision_KA_SubArray_MIN {
    public static void rivisionSubArray_minSum(int arr[]) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE; //+infinity
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];

            /* 

            //First update minSum
            minSum = Math.min(currentSum, minSum);

            */

            if(currentSum<minSum){
                minSum = currentSum;
                start = tempStart;
                end = i;
            }

            //second reset the currentSum
            if(currentSum>0){
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