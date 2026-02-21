import java.util.*;
class InsertionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
           int key = arr[i];
           int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                    arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
