import java.util.*;
class PrefixArrayBuild{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println("the prefix array is");
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
