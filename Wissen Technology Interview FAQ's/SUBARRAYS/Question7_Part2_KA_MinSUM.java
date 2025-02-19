//Using Kadane's algorithm we can find maximumSum and minimumSum of the elements of the contiguous subarray

//PART-2 --> find minimumSum of the contiguous subarray
public class Question7_Part2_KA_MinSUM {
	public static void part2_ka_minSum(int arr[]){
    int currentSum = 0;
	int minimumSum = Integer.MAX_VALUE; //+inifinity

	System.out.println("\nIndex | Current Element | Current Sum | Minimum Sum");
        System.out.println("---------------------------------------------------");

	
	for(int i=0; i<arr.length; i++){
		currentSum += arr[i];

		 // Print debug info before updating minimumSum
		 System.out.printf("%5d | %15d | %11d | %11d\n", i, arr[i], currentSum, minimumSum);
		 
		//First, update min sum
		minimumSum=Math.min(currentSum, minimumSum);
		

		//Then reset currentSum if it becomes positive
		if(currentSum>0){
			currentSum = 0;
		}
	}
	System.out.println("\n---------------------------------------------------");
	 System.out.println("\n Min sum of subarray : "+minimumSum+"\n");
	}
	
	public static void main(String[] args){
	 int arr[] = {3, -4, 2, -3, -1, 7, -5};
	 //int arr[] =  {2, 6, 8, 1, 4};
	 //int arr[] = {-1,-3,-6,-2,-5};

	 part2_ka_minSum(arr);
	}
}


/*
 OUTPUT
 ------

Index | Current Element | Current Sum | Minimum Sum
---------------------------------------------------
    0 |               3 |           3 |  2147483647
    1 |              -4 |          -4 |           3
    2 |               2 |          -2 |          -4
    3 |              -3 |          -5 |          -4
    4 |              -1 |          -6 |          -5
    5 |               7 |           1 |          -6
    6 |              -5 |          -5 |          -6

---------------------------------------------------

 Min sum of subarray : -6

 */