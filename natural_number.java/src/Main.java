import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the last n number");
        int n = sc.nextInt();
        int val = 1 ; int sum=0 ;
        while (val<=n) {
            if (sum == sum + val ) {
                System.out.println(sum);
                break;
            }

            else if (  val == val + 1) {
                System.out.println(sum);
                break;
            }
            else {
                System.out.println(sum);
                break;
            }

        }

    }
}