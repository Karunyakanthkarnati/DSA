import java.util.*;
class BubbleSortOptimizedCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean swap=false;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            
            if(arr[i]>arr[i+1]){
                swap = true;
                break;
            }
           
        }
        if(!swap){
                System.out.println("The given array is sorted");
            }
        else{
                System.out.println("The given array is not sorted");
            }
    }
}
