public class Main {
    public static void main(String[] args) {
        // star pattern
//        for (int line = 1; line<=4 ; line++){
//            for (int star=1; star<=line; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // inverted star pattern
//        int n = 4;
//        for(int line= 1; line<=n; line++){
//            for(int star=1; star<=n-line+1; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //half piramid
        int n = 4;
        for(int line=1; line<=n; line++ ){
            for (int number= 1 ; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
