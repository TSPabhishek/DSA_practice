import java.util.Scanner;

public class print1ton {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want upto ");
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
