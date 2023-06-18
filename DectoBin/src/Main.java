public class Main {

    public static void DectoBin(int Deci){
        int myDeci = Deci;
        int power = 0;
        int Bin = 0;
        while (Deci>0){
            int lastdigit = Deci % 2;
            Bin=Bin+(lastdigit*(int)Math.pow(10,power));
            power++;
            Deci = Deci/2;
        }
        System.out.println("the binary no of "+ myDeci +" is "+ Bin);
    }


    public static void main(String[] args) {
        DectoBin(7);
    }
}