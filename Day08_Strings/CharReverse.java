import java.util.*;
class CharReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int n= str.length();
        System.out.println("The reversed characters in string is ");
        for(int i = n-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
