package live_review.week12.access.a;

public class Windows extends Computer{
    public static void main(String[] args) {
        Windows w = new Windows();
        String brand = w.brand; // i can access brand (default) because it's in same package
    }
}
