package day29_inheritance.HW.phone;

public class Phone {
    private String brand, model, size, color;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price>0) {
            this.price = price;
        } else {
            System.err.println("invalid price: " + price);
            System.exit(1);
        }
    }

    public void setInfo(String model, String size, String color, int price) {
        brand = getClass().getSimpleName();
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }
    public void call(){
        System.out.println(getBrand() + " " + getModel() + " is calling");
    }
    public void text(){
        System.out.println(getBrand() + " " + getModel() + " is texting");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
