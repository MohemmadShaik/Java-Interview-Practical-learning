//Using Kadane's algorithm we can find maximumSum and minimumSum of the elements of the contiguous subarray
//Time complexity: O(n)
//PART-1 --> find maximumSum of the contiguous subarray

public class Question7_Part1_KA_MaxSUM{
	public static void ka_maxSum(int arr[]){
		int currentSum = 0;
		int maximumSum = Integer.MIN_VALUE; //-ve infinity
		
		for(int i = 0; i<arr.length; i++){
			currentSum += arr[i];
			
			//First, update max sum
			maximumSum = Math.max(currentSum, maximumSum);
			
			//Then reset currentSum if it becomes negative
            if(currentSum < 0){
				currentSum = 0;
			}
		}
		System.out.println("\n Max sum number is : "+maximumSum+"\n");
	}
	public static void main(String[] args){
		int arr[] = {3, -4, 2, -3, -1, 7, -5};
        //int arr[] =  {2, 6, 8, 1, 4};
		ka_maxSum(arr);
	} 
}



/*
 OUTPUT :
 -------
Max sum number is : 7
 
 */