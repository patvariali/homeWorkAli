package live_review.week12.discordUsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Admin extends DiscordUser {
    private final List<Channel> CHANNELS = new ArrayList<>();

    public List<Channel> getChannels() {
        return CHANNELS;
    }

    public Admin(String name, String id, String date) {
        super("Admin", name, id, date);
    }

    public void createChannel(String channelName) {
        Channel channel = new Channel(channelName);
        CHANNELS.add(channel);
        System.out.println("Creating new channel " + channelName);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending announcement: " + message);
    }
}
