import java.util.*;
class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = -1;
        System.out.println("Enter the elements : ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value : ");
        int key = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(key == arr[i]){
                index = i;
                break;
            }
            
        }
        System.out.println("Key is existed at index "+index);
    }
}
