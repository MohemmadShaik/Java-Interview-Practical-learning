package PART3_BruteForce_Approach;

public class Problem1_BFA_SubArray_MAX {
   
     public static void bfa_maxSum(int arr[]){

        int minSum = Integer.MAX_VALUE; //+infinity
        int maxSum = Integer.MIN_VALUE; //-infinity

      System.out.println("\n  i   | j   | k   |    currentSum    |    minSum     |    maxSum");
      System.out.println("----------------------------------------------------------------------------");
        for(int i=0 ; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currentSum = 0;
                for(int k=i; k<=j; k++){
                    //System.out.print(arr[k]+" ");
                    System.out.printf("%4d %5d %6d %15d %18d %15d\n", arr[i], arr[j], arr[k],currentSum,minSum,maxSum);
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
        System.out.println("\n---------------------------------------------------------------------------------");
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


/*
 
  i   | j   | k   |    currentSum    |    minSum     |    maxSum
----------------------------------------------------------------------------
   3     3      3               0         2147483647     -2147483648
   3    -4      3               0                  3               3
   3    -4     -4               3                  3               3
   3     2      3               0                 -1               3
   3     2     -4               3                 -1               3
   3     2      2              -1                 -1               3
   3    -3      3               0                 -1               3
   3    -3     -4               3                 -1               3
   3    -3      2              -1                 -1               3
   3    -3     -3               1                 -1               3
   3    -1      3               0                 -2               3
   3    -1     -4               3                 -2               3
   3    -1      2              -1                 -2               3
   3    -1     -3               1                 -2               3
   3    -1     -1              -2                 -2               3
   3     7      3               0                 -3               3
   3     7     -4               3                 -3               3
   3     7      2              -1                 -3               3
   3     7     -3               1                 -3               3
   3     7     -1              -2                 -3               3
   3     7      7              -3                 -3               3
   3    -5      3               0                 -3               4
   3    -5     -4               3                 -3               4
   3    -5      2              -1                 -3               4
   3    -5     -3               1                 -3               4
   3    -5     -1              -2                 -3               4
   3    -5      7              -3                 -3               4
   3    -5     -5               4                 -3               4
  -4    -4     -4               0                 -3               4
  -4     2     -4               0                 -4               4
  -4     2      2              -4                 -4               4
  -4    -3     -4               0                 -4               4
  -4    -3      2              -4                 -4               4
  -4    -3     -3              -2                 -4               4
  -4    -1     -4               0                 -5               4
  -4    -1      2              -4                 -5               4
  -4    -1     -3              -2                 -5               4
  -4    -1     -1              -5                 -5               4
  -4     7     -4               0                 -6               4
  -4     7      2              -4                 -6               4
  -4     7     -3              -2                 -6               4
  -4     7     -1              -5                 -6               4
  -4     7      7              -6                 -6               4
  -4    -5     -4               0                 -6               4
  -4    -5      2              -4                 -6               4
  -4    -5     -3              -2                 -6               4
  -4    -5     -1              -5                 -6               4
  -4    -5      7              -6                 -6               4
  -4    -5     -5               1                 -6               4
   2     2      2               0                 -6               4
   2    -3      2               0                 -6               4
   2    -3     -3               2                 -6               4
   2    -1      2               0                 -6               4
   2    -1     -3               2                 -6               4
   2    -1     -1              -1                 -6               4
   2     7      2               0                 -6               4
   2     7     -3               2                 -6               4
   2     7     -1              -1                 -6               4
   2     7      7              -2                 -6               4
   2    -5      2               0                 -6               5
   2    -5     -3               2                 -6               5
   2    -5     -1              -1                 -6               5
   2    -5      7              -2                 -6               5
   2    -5     -5               5                 -6               5
  -3    -3     -3               0                 -6               5
  -3    -1     -3               0                 -6               5
  -3    -1     -1              -3                 -6               5
  -3     7     -3               0                 -6               5
  -3     7     -1              -3                 -6               5
  -3     7      7              -4                 -6               5
  -3    -5     -3               0                 -6               5
  -3    -5     -1              -3                 -6               5
  -3    -5      7              -4                 -6               5
  -3    -5     -5               3                 -6               5
  -1    -1     -1               0                 -6               5
  -1     7     -1               0                 -6               5
  -1     7      7              -1                 -6               5
  -1    -5     -1               0                 -6               6
  -1    -5      7              -1                 -6               6
  -1    -5     -5               6                 -6               6
   7     7      7               0                 -6               6
   7    -5      7               0                 -6               7
   7    -5     -5               7                 -6               7
  -5    -5     -5               0                 -6               7

---------------------------------------------------------------------------------
Min sum is : -6
Max sum is : 7



 */