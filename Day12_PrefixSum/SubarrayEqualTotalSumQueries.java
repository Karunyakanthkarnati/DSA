import java.util.*;
class SubarrayEqualTotalSumQueries{
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
        int s;
        int q = sc.nextInt();
        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l==0){
                s = prefix[r];
            }
            else{
                s = prefix[r] - prefix[l-1];
            }
            if(s == prefix[n-1]){
                count++;
            }
        }
        System.out.println("The no.f subarrays sum equal to total array sum is" + count);
        
    }
}
