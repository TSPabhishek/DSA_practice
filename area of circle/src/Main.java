import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of r to get area");
        float r = sc.nextFloat();

        float Area = (float) (3.14*r*r);
        System.out.println(Area);
    }
}