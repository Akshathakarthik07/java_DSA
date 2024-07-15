package Area;

public class Main {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(10, 12);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        Circle circle = new Circle(7.77);
        System.out.println("Area of the Circle: " + circle.getArea());
    }
}
