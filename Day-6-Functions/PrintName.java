import java.util.*;

class PrintName{
    static void Printname(String Name){
        System.out.println("My Name is "+Name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name  = sc.nextLine();
        Printname(name);
    }
}
