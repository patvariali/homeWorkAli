package live_review.week11.cities;

import java.util.ArrayList;

public class TestCityObj {
    //line 300, 657
    public static void main(String[] args) {
        ArrayList<City> cities = Database.data;
        Filters.filterByState(cities, "california");
        Filters.filterByGrowth(cities, 10, 20);
        Filters.filterByCityName(cities, "min");
        Filters.filterByPopulation(cities, 1000000);


    }
}
