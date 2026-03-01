import java.util.*;

class FirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String firstWord = str.trim().split("\\s+")[0];
        System.out.println(firstWord);
    }
}
