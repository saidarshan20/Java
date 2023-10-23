public class substring {
    public static String getSub(String str, int si, int ei) {
        String sub = "";
        for(int i=si; i<ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]) {
        String str = "Saidarshan Sahu";

        //Function which we write
        System.out.println(getSub(str,0,6));

        //Inbuilt function
        System.out.println(str.substring(0,7));
    }
}