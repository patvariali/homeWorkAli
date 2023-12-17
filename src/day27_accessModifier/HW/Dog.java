package day27_accessModifier.HW;

public class Dog {
    public String breed, size, color;
    public char gender;
    public int age;
    public boolean isFriendly;
    public static int numberOfLegs, numberOfEyes, numberOfWings;

    public Dog(String breed, String size, String color, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfWings = 0;
        numberOfEyes = 2;
        numberOfLegs = 4;
    }

    public static void eat() {
        System.out.println("Dog is eating");
    }

    public static void drink() {
        System.out.println("Dog is drinking");
    }

    public static void sleep() {
        System.out.println("Dog is sleeping");
    }

    public static void play() {
        System.out.println("Dog is playing");
    }

    public static void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                ", number of legs=" + numberOfLegs +
                ", number of eyes=" + numberOfEyes +
                ", number of wings=" + numberOfWings +
                '}';
    }
}
