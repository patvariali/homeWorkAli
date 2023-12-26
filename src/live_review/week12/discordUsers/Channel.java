package live_review.week12.discordUsers;

public class Channel {
    private String channelName;

    public Channel(String channelName) {
        setChannelName(channelName);
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return  channelName;
    }
}
