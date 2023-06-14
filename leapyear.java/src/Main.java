import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int Y = sc.nextInt();
        if (Y%4 == 0 ){
            System.out.println("leap year");
        }
        else {
            System.out.println("non leap year");
        }
    }
}