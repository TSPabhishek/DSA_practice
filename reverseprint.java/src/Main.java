import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number to print it reverse");
        int n = sc.nextInt();
        while (n>0){
            int lastdigit = n%10; //last digit milega
            System.out.print(lastdigit);
            n=n/10; //last digit marega
        }


    }
}