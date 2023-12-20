package live_review.week11.drinksVending;

import java.util.ArrayList;

public class DrinkVending {
    private double revenue;
    private ArrayList<Drink> allDrinks;

    public DrinkVending() {
        allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> drinksList) {
        allDrinks = new ArrayList<>();
        allDrinks.addAll(drinksList);
    }

    String printable() {
        String result = "";
        for (Drink eachDrink : allDrinks) {
            result += eachDrink;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Vending Machine: \n" +
                "Revenue: "+revenue + "\n"+
                printable();
    }

    private Drink getDrink(String drinkName) {
        for (Drink eachDrink : allDrinks) {
            if (eachDrink.getName().equalsIgnoreCase(drinkName) && eachDrink.getQuantity() > 0) {
                return eachDrink;
            }
        }
        throw new IllegalArgumentException("No such a drink");
    }

    public Drink vend(String drinkName) {
        Drink drink = getDrink(drinkName);
        if (drink != null) {
            drink.setQuantity(drink.getQuantity() - 1);
            revenue += drink.getPrice();
            return drink;
        }
        return null;
    }

    public void stock(ArrayList<Drink> listOfDrinks) {
        for (Drink addEach : listOfDrinks) {
            if (allDrinks.contains(addEach)) {
                for (Drink inStockDrinks : allDrinks) {
                    if (inStockDrinks.getName().equalsIgnoreCase(addEach.getName())) {
                        inStockDrinks.setQuantity(inStockDrinks.getQuantity() + addEach.getQuantity());
                    }
                }
            } else {
                allDrinks.add(addEach);
            }
        }
    }
}
