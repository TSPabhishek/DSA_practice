public class Main {

    public static int Linearsearch(String[] menu, String key){
        for (int i = 0 ; i<menu.length;i++){
            if(menu[i] == key){
                return i;
            }
        }return  -1;
    }


    public static void main(String[] args) {
        String menu[] = {"dosa","samosa","idli","dalpakwan"};
        String key = "idli";
        int idexvalue = Linearsearch(menu,key);
        if(idexvalue == -1){
            System.out.println("not found");
        }else {
            System.out.println("index value got at " + idexvalue);
        }
    }
}