package live_review.week12.discordUsers;

import day24.LocalDateIntro;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DiscordUser {
    private String role;
    private String name;
    private String id;
    private LocalDate accCreationDate;

    public void setAccCreationDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.accCreationDate = LocalDate.parse(date, formatter);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccCreationDate() {
        return accCreationDate;
    }



    public DiscordUser(String role, String name, String id, String date) {
        setRole(role);
        setName(name);
        setId(id);
        setAccCreationDate(date);
    }

    public void sendMessage(String message){
        System.out.println("Sending message: \"" + message + "\"");
    }
    public  void joinDiscord(String discordUrl){
        System.out.println(getName() + " joining: \"" + discordUrl + "\"");
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accCreationDate=" + accCreationDate +
                '}';
    }

}
