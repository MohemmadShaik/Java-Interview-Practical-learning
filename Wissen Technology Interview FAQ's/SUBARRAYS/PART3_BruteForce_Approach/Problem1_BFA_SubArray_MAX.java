package PART3_BruteForce_Approach;

public class Problem1_BFA_SubArray_MAX {
   
     public static void bfa_maxSum(int arr[]){

        int minSum = Integer.MAX_VALUE; //+infinity
        int maxSum = Integer.MIN_VALUE; //-infinity


        for(int i=0 ; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currentSum = 0;
                for(int k=i; k<=j; k++){
                    //System.out.print(arr[k]+" ");
                    currentSum += arr[k];
                }
                //System.out.print(currentSum+" ");
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }

                if(currentSum < minSum){
                    minSum = currentSum;
                }
            }
        }
        System.out.println("Min sum is : "+minSum);
        System.out.println("Max sum is : "+maxSum);
     }
    public static void main(String[] args) {
        int arr[] = { 3, -4, 2, -3, -1, 7, -5 }; //both -ve and +ve values
        // int arr[] = {2, 6, 8, 1, 4}; //only +ve values
        //int arr[] = {-1,-3,-6,-2,-5}; //only -ve values
        bfa_maxSum(arr);
    }
    
}
