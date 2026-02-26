import java.util.*;
class SumOfDigits{
    static int Sum(int n){
        if(n == 0) return 0;
        return (n%10) + Sum(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int N = sc.nextInt();
        System.out.println("The sum of digits is : "+Sum(N));
    }
}
