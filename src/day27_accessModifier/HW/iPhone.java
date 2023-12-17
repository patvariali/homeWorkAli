package day27_accessModifier.HW;

public class iPhone {
    public static String brand, madeIn, designedIn, OS;
    public String model, size, color;
    public int price;
    public static boolean isSmartPhone;

    static {
        brand = "Apple";
        madeIn = "China";
        designedIn = "California, USA";
        OS = "IOS";
    }

    public iPhone(String model, String size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public static void printOperatingSystem() {
        System.out.println(OS);
    }

    public void call(long phoneNumber) {
        System.out.println(model + " is calling to " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(model + " is calling to " + phoneNumber + " via FaceTime");
    }

    public void faceTime(String email) {
        System.out.println(model + " is sending an email to " + email + " via FaceTime");
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "brand='" + brand + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", designedIn='" + designedIn + '\'' +
                ", Operational System=" + OS +
                '}';
    }
}
