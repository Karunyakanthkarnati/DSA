import java.util.*;
class FirstLastCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() == 0){
            System.out.println("Empty String");
        }
        else{
        System.out.println("First charecter is :"+str.charAt(0));
        System.out.println("Last charecter is :"+str.charAt(str.length()-1));
        }
    }
}
