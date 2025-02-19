/* 
     Question 7 :
     - - - - - -
Given an array containing n integers. 
The problem is to find the sum of the elements of
the contiguous subarray having the smallest(minimum) sum. 
Statement 1 : Input : arr[] = {3, -4, 2, -3, -1, 7, -5} 
              Output : -6 
              Subarray is {-4, 2, -3, -1} = -6 
Statement 2 : Input : arr = {2, 6, 8, 1, 4} 
              Output : 1
     PART2 : Using PrefixSum approach (better compare to brute force approach) --> time complexity = o(n^2)
             Key Reminder : - We create a new a array called prefix[] with the same length of the given array to calculate and store the prefix sum.
                            - By default we will initialize the prefix[0] = givenarr[0], Such that the first index value of both the arrays should be same to calculate the cummulative sum (or) prefix sum correctly.
                            
                            // Step 1: Compute the prefix sum array
                            - First will calculate prefix sum array or cummulative sum array
                              using one for loop : for(int i=1; i<prefix.length; i++)
                              and the formula : 
                              prefix[i] = prefix[i-1] + givenarr[i] 

                            // Step 2 : Initailize minSum and maxSum

                              int max_sum = Integer.MIN_VALUE; //-infinity
                              int min_sum = Integer.MAX_VALUE; //+infinity
                            
                            // Step 3: Calculate subarray sums using prefix sum
                            - Now will use two for loops, one for start and the other for loop for end 
                              and will use the below formula to calculate the subarray sum :
                              
                                int subarraySum = (i == 0) ? prefix[j] : (prefix[j] - prefix[i - 1]);

                                Note : Here start =i, end = j;
                            
                            // Step 4 : Update minSum and maxSum

                            if (subarraySum > max_sum) {
                                  max_sum = subarraySum;
                              }
                            
                            if (subarraySum < min_sum) {
                                 min_sum = subarraySum;
                              }

 */
package PART2_PrifixSum_Approach;

public class Problem1_PSA_SubArray_MAX {

    public static void psa_maxSum(int arr[]){
        int currSum =0;
		int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        //calculate prefix[] sum
        for(int i=1;i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println("\nStart | End | Prefix[end] | Prefix[end] - Prefix[start-1] | currSum | maxSum | minSum ");
        System.out.println("-------------------------------------------------------------------------------------");
        
        //Print subarry using prefix-sum
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                //calculate the sum of subarray using prefix sum
                currSum =   start==0 ? prefix[end] : prefix[end] - prefix[start-1];

               // System.out.println(currSum);

               //find maxSum
               if(currSum > maxSum ){
                maxSum = currSum;
               }

               //find minSum
               if(currSum < minSum){
                 minSum = currSum;
                }

                //System.out.printf("%5d %3d %12d %30d %7d %6d %6d\n", start, end, prefix[end], prefix[end]-prefix[start-1], currSum,maxSum,minSum) ;
                System.out.printf("%5d %3d %12d %32s %9d %8d %8d\n", 
    start, end, prefix[end], (start == 0 ? "N/A" : String.valueOf(prefix[end] - prefix[start - 1])), 
    currSum, maxSum, minSum);

            }
        }
        System.out.println("Max sum is : "+maxSum);
        System.out.println("Min Sum is : "+minSum);
    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 }; //both -ve and +ve values
        // int arr[] = {2, 6, 8, 1, 4}; //only +ve values
        //int arr[] = {-1,-3,-6,-2,-5}; //only -ve values
        psa_maxSum(arr);
    }

}
