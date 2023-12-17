package day28.HW;

public class Circle {
    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public double getRadius() {
        if (radius == 0.0) {
            throw new InvalidEntryException("You didn't set the radius");

        }
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new InvalidEntryException("Radius can't be less than Zero");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + getRadius() +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
