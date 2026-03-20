import java.util.*;

class CircularSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        int currentMax = 0, maxSum = Integer.MIN_VALUE;
        int currentMin = 0, minSum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int x = arr[i];

            totalSum += x;

            // Max Kadane
            currentMax += x;
            maxSum = Math.max(maxSum, currentMax);
            if(currentMax < 0) currentMax = 0;

            // Min Kadane
            currentMin += x;
            minSum = Math.min(minSum, currentMin);
            if(currentMin > 0) currentMin = 0;
        }

        // Edge case: all negative
        if(maxSum < 0) {
            System.out.println(maxSum);
        } else {
            System.out.println(Math.max(maxSum, totalSum - minSum));
        }
    }
}
