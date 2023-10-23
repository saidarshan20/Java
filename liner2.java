import java.util.*;

public class liner2{
    public static int search( String str[], String key){
        for(int i=0; i<str.length; i++){
            if(str[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int n;
        //String key;
        //System.out.print("Enter the size of array : ");
        //n = sc.nextInt();

        //String str[] = new String[n];
        String str[] = {"Apple", "Mango", "Bannana"};

        /*System.out.println("Enter string values : ");
        for(int i=0; i<str.length; i++){
            str[i] = sc.nextLine();
        }*/

        String key = "Mango";

        //System.out.print("Enter which string you want to search : ");
        //key = sc.nextLine();

        int store = search(str,key);

        if(store == -1){
            System.out.println("NOT Found");
        } else {
            System.out.println("Found on : " + store);
        }
    }
}