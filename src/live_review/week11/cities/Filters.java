package live_review.week11.cities;

import java.util.ArrayList;

public class Filters {
    public static void filterByState(ArrayList<City> cities, String state) {
        for (City city : cities) {
            if (city.getState().equalsIgnoreCase(state)) {
                System.out.println(city);
            }
        }
    }

    public static void filterByCityName(ArrayList<City> cities, String start) {
        for (City city : cities) {
            if (city.getCityName().toLowerCase().startsWith(start)) {
                System.out.println(city);
            }
        }
    }

    public static void filterByGrowth(ArrayList<City> cities, double growthRateFrom, double growthRateTo) {
        for (City city : cities) {
            if (city.getGrowthRate() >= growthRateFrom && city.getGrowthRate() <= growthRateTo) {
                System.out.println(city);
            }
        }
    }

    public static void filterByPopulation(ArrayList<City> cities, int population) {
        for (City city : cities) {
            if (city.getPopulation() >= population) {
                System.out.println(city);
            }
        }
    }
}
