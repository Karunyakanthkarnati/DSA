import java.util.*;
class PrintNto1{
    static void PrintNto1(int n){
        if(n==0){
             return;
        } 
        
       System.out.println(n);
        PrintNto1(n-1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int n = sc.nextInt();
        PrintNto1(n);
    }
}
