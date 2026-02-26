import java.util.*;
class Factorial{
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int N = sc.nextInt();
        System.out.println("The Reversed number is "+fact(N));
    }
}
