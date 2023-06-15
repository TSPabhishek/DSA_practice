import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number");
        int n = sc.nextInt();
        int i = 1;
        while(n>=i){
            System.out.println(i);
            i++;
            if(i == 3){
                continue;
            }



        }
    }
}