public class clasnobj {
    public static void main(String args[]) {
        Pen p1 = new Pen(); //To create pen object called p1
        p1.color = "Blue";
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.setColor("Red");
        System.out.println(p1.color);7
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}