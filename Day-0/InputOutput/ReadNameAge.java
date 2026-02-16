import java.util.Scanner;
class ReadNameAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Your name is "+name);
        System.out.println("your age is "+age);
    }
}
