package programming_concepts_I.LAB6;

public class Circle {
    private double radius;
    final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}
