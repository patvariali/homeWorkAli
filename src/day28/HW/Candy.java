package day28.HW;

import java.util.InputMismatchException;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidEntryException("Quantity can't be zero or negative: " + quantity);
        }
        this.quantity = quantity;
    }

    public String price() {
        if (getPrice() == 0) {
            return "free";
        }
        return String.valueOf(getPrice());
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new InvalidEntryException("Price can't be negative");

        }
        this.price = price;
    }

    public boolean getHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + price() +
                ", hasPeanuts=" + getHasPeanuts() +
                '}';
    }
}
