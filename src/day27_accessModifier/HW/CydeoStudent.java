package day27_accessModifier.HW;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName, fieldOfStudy, programmingLanguage, secretCode;

    static {
        schoolName = "Cydeo School";
        fieldOfStudy = "Java QA automation";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printSecretCode() {
        System.out.println(secretCode);
    }

    public void attendClass() {
        System.out.println(name + " attend class " + fieldOfStudy);
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", secretCode=" + secretCode +
                ", field of study=" + fieldOfStudy +
                ", programming language=" + programmingLanguage +
                '}';
    }
}
