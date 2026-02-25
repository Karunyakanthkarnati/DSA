import java.util.*;
class MaxOfTwo{
    static void Max(int a,int b){
        if(a>=b){
            System.out.println("The Maximum number is "+a);
        }
        else{
            System.out.println("The Maximum number is "+b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummbers");
        int A = sc.nextInt();
        int B = sc.nextInt();
        Max(A,B);
    }
}
