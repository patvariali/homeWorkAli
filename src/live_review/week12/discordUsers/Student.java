package live_review.week12.discordUsers;

import java.time.LocalDate;

public class Student extends DiscordUser{

    public Student(String name, String id, String accCreationDate) {
        super("Student", name, id, accCreationDate);
    }

    @Override
    public void sendMessage(String chatName) {
        super.sendMessage("Sending message to " + chatName);
    }
}
