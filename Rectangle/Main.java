package Rectangle;

public class Main {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.length = 10;
        r1.breadth = 10;
        System.out.println(r1.area());
        Rectangle r2=new Rectangle();
        r2.length = 7;
        r2.breadth = 7;
        System.out.println(r2.area());
        Rectangle r3=new Rectangle();
        r3.length = 30;
        r3.breadth = 20;
        System.out.println(r3.area());
    }
}
