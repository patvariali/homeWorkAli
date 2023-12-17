package day28.HW;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new InvalidEntryException("Side can't be less than ZERO");
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + getSide() +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
