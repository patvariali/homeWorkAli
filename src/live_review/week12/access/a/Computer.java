package live_review.week12.access.a;

public class Computer {
    public String os;
    protected int memory;
    String brand;
    private boolean hasWifiCard;

    public boolean isHasWifiCard() {
        return hasWifiCard;
    }

    public void setHasWifiCard(boolean hasWifiCard) {
        this.hasWifiCard = hasWifiCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifiCard=" + hasWifiCard +
                '}';
    }
}
