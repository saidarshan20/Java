public class shortest {
    public static float getshortest(String str) {
        int x = 0, y = 0;

        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);
            //South
            if(dir == 'S') {
                y--;
            } else if(dir == 'N') {
                y++;
            } else if(dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str = new String("WNEENESENNN");
        System.out.println(getshortest(str));
    }
}