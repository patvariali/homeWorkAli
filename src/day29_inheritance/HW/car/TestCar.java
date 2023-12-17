package day29_inheritance.HW.car;

public class TestCar {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.setInfo("Accord", "Black", 2022, 10000);
        System.out.println(honda);
    }
}
