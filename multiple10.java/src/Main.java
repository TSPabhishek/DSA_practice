import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("enter the number: ");

        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
            System.out.print("enter the number: ");
        }while (true);
    }
}