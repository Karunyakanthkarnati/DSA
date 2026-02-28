import java.util.*;
class ReverseWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        int n = words.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(words[i] +" ");
        }
        
    }
}
