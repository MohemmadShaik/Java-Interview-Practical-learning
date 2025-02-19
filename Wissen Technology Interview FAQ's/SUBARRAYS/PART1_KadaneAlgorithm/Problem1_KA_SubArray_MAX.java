//PART1_KadaneAlgorithm/Problem1_KA_SubArray_MAX.java
/* 
Q1) Find the maximum sum of the contiguous subarray using Kadane's Algorithm.
Statement 1 : given array: {3, -4, 2, -3, -1, 7, -5}
              maxsum output: 7

Statement 2 : given array: {2, 6, 8, 1, 4}
			  maxsum output: 21

Statement 3 : given array: {-1,-3,-6,-2,-5}
			  maxsum output: -1


Q2) Can you please debug the code to know how the currentSum and maxSum are changing in each iteration?

OUTPUT: 
======
         Index | Current Element | Current Sum |  Max Sum    |   Reset Current Sum?
         ------------------------------------------------------------------------------
             0 |              -1 |          -1 | -2147483648 |          reset to 0
             1 |              -3 |          -3 |          -1 |          reset to 0
             2 |              -6 |          -6 |          -1 |          reset to 0
             3 |              -2 |          -2 |          -1 |          reset to 0
             4 |              -5 |          -5 |          -1 |          reset to 0
         
         MaxSum using Kadane's Algorithm : -1

*/
package PART1_KadaneAlgorithm;

class Problem1_KA_SubArray_MAX{
	public static void maxSum_part1(int arr[]){
		int currentSum =0;
		int maxSum = Integer.MIN_VALUE; //-ve infinity
        
		//Q2) Debug the code
		System.out.println("\nIndex | Current Element | Current Sum |  Max Sum    |   Reset Current Sum?");
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i=0; i<arr.length; i++){
			currentSum += arr[i];

			// Print debug info before updating maxSum and to know how the currentSum and maxSum are changing in each iteration

			boolean reset = currentSum < 0;

			System.out.printf("%5d | %15d | %11d | %11d | %19s\n", i, arr[i], currentSum, maxSum, reset ? "reset to 0" : "No reset");

	
			//first update maxSum
			maxSum = Math.max(currentSum,maxSum);
			
			//second reset the currentSum
			
			if(reset){
				currentSum	= 0;
			}
		}
		
		System.out.println("\nMaxSum using Kadane's Algorithm : " +maxSum+"\n");
			
			
	}
	
	public static void main(String[] args){
		//int arr[] = {3, -4, 2, -3, -1, 7, -5}; //both positive and negative numbers
		//int arr[] = {2, 6, 8, 1, 4}; //only positive numbers
		int arr[] = {-1,-3,-6,-2,-5}; //only negative numbers
		maxSum_part1(arr);
	}
}
