public class Main {

    public static int Linearsearch (int numbers[], int key){
        for(int i=0; i< numbers.length;i++){
            if (numbers[i] == key){
                return i;
            }
        }return -1;
    }


    public static void main(String[] args) {
        int numbers[] = {5,10,15,20,25,30,35,40,45,50};
        int key = 10;
        int index = Linearsearch(numbers,key);
        if (index==-1){
            System.out.println("not found");
        }else{
            System.out.println("index at " + index);
        }
    }
}