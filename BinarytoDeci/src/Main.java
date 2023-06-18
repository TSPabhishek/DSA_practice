public class Main {


    public static void bintodec(int Binnum){
        int mynum = Binnum;
        int  deci =0;
        int power=0;
        while (Binnum>0){
            int lastDigit = Binnum%10;
            deci=deci+(lastDigit*(int) Math.pow(2,power));
            power++;
            Binnum=Binnum/10;
        }
        System.out.println("The binary no. of "+mynum+" is "+deci);
    }

    public static void main(String[] args) {
        bintodec(101);
    }
}