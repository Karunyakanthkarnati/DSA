import java.util.*;
class InsertionSortShiftCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n =sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1] = arr[j];
                count++;
            }
            arr[j+1] = key;
        }
        System.out.println("No.of shifts performed are"+count);
    } 
}
