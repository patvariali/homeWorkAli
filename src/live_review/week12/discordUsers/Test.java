package live_review.week12.discordUsers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        Admin admin = new Admin("Ali", "A1", "28/03/2000");
        admin.createChannel("CYDEO");
        System.out.println(admin.getChannels());
        admin.sendMessage("Hi");
        admin.joinDiscord("abra");
        Student student = new Student("Baba", "A2", "03/05/2018");
        student.sendMessage("Hola");
    }
}
