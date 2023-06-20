public class Main {

    public static void Hollow_rectangle(int row , int coloumn){
        //outter loop

        for (int i = 1; i<=row;i++){

            //inner loop

            for(int j = 1; j<=coloumn ; j++){
                if(i==1||i==row||j==1||j==coloumn){
                    //boundary cells
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void Inverted_rotated_half_pyramid(int row ){
        for (int i = 1; i<=row ; i++){
            for(int j = 1; j<=row-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void Inverted_half_pyramid_with_numbers( int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }



    public static void main(String[] args) {
            Inverted_half_pyramid_with_numbers(5);
    }
}