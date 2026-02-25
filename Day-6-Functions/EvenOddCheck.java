import java.util.*;
class EvenOddCheck{
    static boolean Even_Odd(int a){
            if(a%2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Even_Odd(n);
        System.out.println(Even_Odd(n));
    }
}
