import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements ");
        int n = sc.nextInt();
        System.out.println("Enter the sorted array :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        int index = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(key == arr[mid]){
                index = mid;
                break;
            }
            else if(key < arr[mid]){
                high = mid-1;
            }
            else  {
                low = mid + 1;
            } 
        }
        System.out.println("The index of key is "+index);
    }
}
