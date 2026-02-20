import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("The Sorted array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
