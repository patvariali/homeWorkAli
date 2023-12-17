package day28.HW;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new InvalidEntryException("Width can't be less than ZERO");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new InvalidEntryException("Length can't be less than ZERO");
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return (length + width) * 2;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
