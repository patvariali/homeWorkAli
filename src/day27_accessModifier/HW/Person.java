package day27_accessModifier.HW;

public class Person {
    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;
    }

    public static void printPlanetName() {
        System.out.println(planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "isHuman='" + isHuman + '\'' +
                ", hasNose='" + hasNose + '\'' +
                ", number of heads=" + numberOfHeads +
                ", number of wings=" + numberOfWings +
                ", planet=" + planet +
                '}';
    }
}
