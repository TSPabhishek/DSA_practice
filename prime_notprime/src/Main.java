public class Main {
    public static boolean isPrime(int a) {


//        Non optimized method;

//        if(a==2){
//            return true;
//        }
//        for (int i = 2; i<=a-1 ; i++){
//            if(a%i==0){
//                return false;
//            }
//        }
//        return true;
//    }


//        Optimized Method(using sqrt)

        if (a == 2) {
            return true;
        }
        for(int i = 2 ; i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}