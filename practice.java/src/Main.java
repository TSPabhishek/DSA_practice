import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost of pencil");
        float Pencil = sc.nextFloat();
        System.out.println("enter the cost of pen");
        float Pen = sc.nextFloat();
        System.out.println("enter the cost of eraser");
        float Eraser = sc.nextFloat();
        float sum = Pencil + Pen + Eraser ;
        System.out.println(sum );

        //adding percent
        float gst = sum + (0.18f * sum);
        System.out.println("with gst bill " + gst);

    }
}