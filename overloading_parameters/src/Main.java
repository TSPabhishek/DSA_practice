public class Main {

    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b , float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.9f,5.7f,9.8f));
    }
}