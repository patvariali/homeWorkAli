package live_review.week11.drinksVending;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Drink cocaCola = new Drink("cocaCola", 1.5, 100);
        Drink sprite = new Drink("sprite", 1.5, 100);
        Drink pepsi = new Drink("pepsi", 1.5, 100);
        Drink drPepper = new Drink("dr. pepper", 1.7, 44);

        DrinkVending machine1 = new DrinkVending(new ArrayList<>(Arrays.asList(cocaCola, sprite, pepsi)));
        System.out.println(machine1);
        machine1.vend("sprite");
        System.out.println(machine1);
        machine1.stock(new ArrayList<>(Arrays.asList(cocaCola, sprite, drPepper)));
        System.out.println(machine1);

    }
}
