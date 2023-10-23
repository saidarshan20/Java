/*we can use same name for two functions but we have to change parameters like in first one 
we've two parameter but in next one we've three parameter , it's not depended on data type of function*/
public class functionoverload{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(3,4,5));
        System.out.println(sum(3.21f,25.08f));
    }
}