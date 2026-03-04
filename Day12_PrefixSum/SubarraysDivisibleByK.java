import java.util.*;
class SubarraysDivisibleByK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int k = sc.nextInt();
        int s;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i == 0){
                    s = prefix[j];
                }
                else{
                    s = prefix[j] - prefix[i-1];
                }
                if(s % k == 0){
                    count++;
                }
            }
        }
        System.out.println("The no.of subarrays divisible by "+k+" is "+count);
    }
}
