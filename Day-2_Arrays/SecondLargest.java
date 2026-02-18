
import java.util.*;
class SecondLargest{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE){
            System.out.println("Second largest number does not exist");
        } 
        else{
            System.out.println("The second largest number is "+second_largest);
        }
        
    }
}
