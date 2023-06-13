import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        //ternary operator
        String reportcard = marks>=33 ? "Pass" : "Fail" ;
        System.out.println(reportcard);
    }
}