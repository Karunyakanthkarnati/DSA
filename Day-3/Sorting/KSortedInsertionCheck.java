import java.util.*;
class KSortedInsertionCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n = sc.nextInt();
        System.out.println("Enter k value");
        int k = sc.nextInt();
        int count;
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean ksorted = true;
        for(int i=1;i<n;i++){
            count = 0;
            int key = arr[i];
            int j;
            for(j = i-1;j>=0 && arr[j] > key;j--){
                arr[j+1] = arr[j];
                count++;
            }
            arr[j+1] = key;
            if(count > k){
                ksorted =  false;
                break;
            }
        }
        if(ksorted == true){
            System.out.println("The given array is k sorted");
        }
        else{
            System.out.println("The given array is not k sorted");
        }
        
    }
}
