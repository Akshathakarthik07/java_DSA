package Area;

public class Circle implements Shape {
    private double radius;
    public double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}