package PART1_KadaneAlgorithm;

public class Problem3_Rivision_KA_SubArray_MIN {
    public static void rivisionSubArray_minSum(int arr[]) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE; //+infinity

        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];

            //First update minSum
            minSum = Math.min(currentSum, minSum);

            //second reset the currentSum
            if(currentSum>0){
                currentSum = 0;
            }
        }
        System.out.println("\nSubarray minSum : "+minSum+"\n");

    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
        rivisionSubArray_minSum(arr);
    }
}