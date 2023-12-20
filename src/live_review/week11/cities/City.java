package live_review.week11.cities;

public class City {
    private String cityName, state;
    private double growthRate;
    private int population;

    public City(String cityName, double growthRate, int population, String state) {
        setCityName(cityName);
        setState(state);
        setGrowthRate(growthRate);
        setPopulation(population);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "cityName='" + cityName + '\'' +
                ", state='" + state + '\'' +
                ", growthRate=" + growthRate +
                ", population=" + population +
                '}';
    }
}
