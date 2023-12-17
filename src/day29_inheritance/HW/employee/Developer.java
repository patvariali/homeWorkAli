package day29_inheritance.HW.employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        String[] progLangArr = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"};
        boolean validProgLang = false;
        for (int i = 0; i < progLangArr.length; i++) {
            if (programmingLanguage.equals(progLangArr[i])) {
                validProgLang = true;
            }
        }
        if (validProgLang) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
    }

    public void setInfo(String name, String jobTitle, char gender, int age, int id, double salary, String programmingLanguage) {
        setName(name);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public void coding() {
        System.out.println(getName() + " is coding" + getProgrammingLanguage());
    }
}
