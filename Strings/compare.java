public class compare {
    public static void main(String args[]) {
        String str = "Tony";
        String str1 = "Tony";
        String str2 = new String("Tony");

        if(str == str1) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //for comparing
        if(str.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}