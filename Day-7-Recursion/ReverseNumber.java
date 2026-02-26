import java.util.*;
class ReverseNumber{
    static int rev = 0;

    static int Reverse(int n) {
        if (n == 0) return 0;
        rev = rev * 10 + (n % 10);
        Reverse(n / 10);
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int N = sc.nextInt();
        System.out.println("The Reversed number is "+Reverse(N));
    }
}
