import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case'%':System.out.println(a%b);
            break;
            default:
                System.out.println("unknown operator entered");
        }
    }
}