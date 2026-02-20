import java.util.*;
class SelectionSortSwapCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        int count = 0;
        int min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                    
                }
                
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println("The number of swaps are "+count);
    }
}
