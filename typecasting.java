public class typecasting{
    public static void main(String args[]){
        float fl = 25.998f; //here we write f after 25.998 coz when we want to type cast float to int compiler take 25.998 as double.
        int n = (int) fl;  //here we write (int) coz we are telling compiler that i want that value in int format and compiler we'll give this value in lossy conversion.
        System.out.println(n);

        char ch = 'A';
        int n2 = ch; //here we get ASCII value of 'A' directly no need to tell compiler like previous one.
        System.out.println(n2);

        byte b = 5;
        b = (byte) (b*2); //here we write (byte) whether ae already know that b is a byte value but when we use expression byte,short and char automatically convert to int and here also java think b*2 is a int value and if we try to covert int to byte then some of out data will loss.
        System.out.println(b);
    }
}