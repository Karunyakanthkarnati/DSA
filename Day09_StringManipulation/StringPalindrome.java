import java.util.*;
class StringPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;
        boolean ispalindrome = true;
        while (left <= right){
            if(str.charAt(left) != str.charAt(right)){
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome == true){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }
        
    }
}
