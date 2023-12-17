package day29_inheritance.HW.employee;

public class Employee {
    private String name, jobTitle;
    private char gender;
    private int age, id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 17 && age < 66) {
            this.age = age;
        } else {
            System.err.println("Invalid age: " + age);
            System.err.println("Age can't be negative, and should be between 18 and 65");
            System.exit(1);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>0) {
            this.salary = salary;
        } else {
            System.err.println("Salary can't be negative");
        }
    }

    public void setInfo(String name, String jobTitle, char gender, int age, int id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
