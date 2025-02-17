/* Question 7 :
   - - - - - -
Given an array containing n integers. 
The problem is to find the sum of the elements of
the contiguous subarray having the smallest(minimum) sum. 
Input : arr[] = {3, -4, 2, -3, -1, 7, -5} 
Output : -6 
Subarray is {-4, 2, -3, -1} = -6 
Input : arr = {2, 6, 8, 1, 4} 
Output : 1


Key Note : - We can find the maxsum of the contiguous subarray using
             Kadane's algorithm.
                  
               The time complexity of the solution is O(n).
               The space complexity of the solution is O(1).
            
           - To find the sum of the contiguous subarray with the smallest sum,
             we can use Kadane’s Algorithm with a flipped logic.

STEP 1 : First of all we will find the maxsum of the contiguous subarray 
         using Kadane's algorithm for arr[] = {3, -4, 2, -3, -1, 7, -5}.

STEP 2 : Later will see how to flip the logic of Kadane's algorithm to get minsum.
        
 

 */

 

 // STEP 1 : Kadane's Algorithm to find the maxsum of the contiguous subarray 
 
 /* 
 public class Question7_SubArray_MaxSum_MinSum {
	
	public static void q7_subarr_sum_max_min(int arr[]){
		int currentsum =0;
		int maxsum = Integer.MIN_VALUE; //-ve infinity
		
		for(int i=0; i<arr.length; i++){
			currentsum += arr[i];

            
			
			if(currentsum < 0){
				currentsum = 0;
			}
			
			// if( currentsum > maxsum)
			// {
			// 	maxsum = currentsum;
			// }

            maxsum = Math.max(currentsum, maxsum);
			
			
		}
		
		System.out.println("\n Max of sum is : "+maxsum+"\n");
	}

    public static void main(String[] args) {
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        q7_subarr_sum_max_min(arr);
    }
    
}

*/

// STEP 2 : Flipping the logic of Kadane's algorithm to get minsum.


public class Question7_SubArray_MaxSum_MinSum {
	
	public static void q7_subarr_sum_max_min(int arr[]){
		int currentsum =0;
		//int maxsum = Integer.MIN_VALUE; //-ve infinity
		int minsum = Integer.MAX_VALUE; //+ve infinity
		
		for(int i=0; i<arr.length; i++){
			currentsum += arr[i];

            
			
            if( currentsum < minsum)
            {
                minsum = currentsum;
            }

            if(currentsum > 0){
				currentsum = 0;
			}	
			
			//minsum = Math.min(currentsum, maxsum)
		}
		
		System.out.println("\n Min of sum is : "+minsum+"\n");
	}

    public static void main(String[] args) {
       // int arr[] = {3, -4, 2, -3, -1, 7, -5};
       int arr[] = {2, 6, 8, 1, 4};
        q7_subarr_sum_max_min(arr);
    }
    
}

