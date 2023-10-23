import java.util.*;

public class shortest {
    public static float getPath(String str) {
        int x=0, y=0;

        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);
            //East
            if(dir == 'E') {
                x++;
            } else if(dir == 'W') {
                x--;
            } else if(dir == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = "EWNS";
        System.out.println(getPath(str));
    }
}