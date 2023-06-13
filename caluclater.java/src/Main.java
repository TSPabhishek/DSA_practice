import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int A = sc.nextInt();
        System.out.println("Enter 2nd number");
        int B = sc.nextInt();
        System.out.println("Enter 3rd number");
        int C = sc.nextInt();
        if(A>B && A>C){
            System.out.println(A +" is greater among all three numbers");
        }
        else if(A<B && B>C){
            System.out.println(B + " is greater among all three numbers");
        }
        else if (B<C && A<C){
            System.out.println(C + " is greater among all three numbers");
        }
        else{
            System.out.println("all numbers are equal");
        }

    }
}