import java.util.*;

class MaxSubarrayWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0, end = 0, tempStart = 0;

        for(int i = 0; i < n; i++) {
            currentSum += arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if(currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        int length = end - start + 1;

        System.out.println(maxSum);
        System.out.println(length);
    }
}
