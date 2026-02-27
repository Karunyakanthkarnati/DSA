import java.util.*;

class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        int n = str.length();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && inWord == false) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        System.out.println("The number of words are: " + count);
    }
}
