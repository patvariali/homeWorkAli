package day29_inheritance.HW.car;

public class Toyota extends Car{
    public static void main(String[] args) {
        Car volvo = new Volvo();
        volvo.setInfo("VS10", "Black", 2020, 10000);
        System.out.println(volvo);
    }
}
