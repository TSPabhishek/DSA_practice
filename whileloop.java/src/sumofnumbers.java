import java.util.Scanner;

public class sumofnumbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number from where u want sum");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);

    }
}
