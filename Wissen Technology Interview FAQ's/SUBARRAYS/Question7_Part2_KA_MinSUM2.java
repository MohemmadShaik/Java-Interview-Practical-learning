
public class Question7_Part2_KA_MinSUM2 {
    public static void part3_ka_minSum(int arr[]) {
        int currentSum = 0;
        int minimumSum = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum < minimumSum) {
                minimumSum = currentSum;
                startIndex = tempStart;
                endIndex = i;
            }

            if (currentSum > 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.print("Min sum subarray: [");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + (i < endIndex ? ", " : ""));
        }
        System.out.println("] with sum: " + minimumSum);
    }

    public static void main(String[] args) {
        //int arr[] = {3, -4, 2, -3, -1, 7, -5};
        int arr[] =  {2, 6, 8, 1, 4};
        part3_ka_minSum(arr);
    }
}
