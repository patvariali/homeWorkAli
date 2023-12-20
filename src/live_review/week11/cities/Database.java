package live_review.week11.cities;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public static ArrayList<City> data;

    static {
        data = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("/Users/patvariali/IdeaProjects/Java_Programming/src/live_review/week11/cities/cities.txt"));
            input.useDelimiter(",|\n");
            while (input.hasNextLine()) {
                String cityName = input.next();
                double growthRate = input.nextDouble();
                int population = input.nextInt();
                String state = input.next();

                City city = new City(cityName, growthRate, population, state);
                data.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
