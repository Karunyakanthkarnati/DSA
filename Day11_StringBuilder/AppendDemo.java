import java.util.*;
class AppendDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.append("hi");
        System.out.println(sb);
    }
}
