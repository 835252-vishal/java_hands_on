package session5;

public class Circle extends Shape {
    int radius;

    double calculateArea() {
        return 3.14 * (radius * radius);
    }

    public Circle(int radius, String shapeName) {
        this.radius = radius;

    }

    public int getRadius() {
        return radius;

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
