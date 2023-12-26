package live_review.week12.olympicSport;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class OlympicSport {
    public static void main(String[] args) {
        System.out.println(getSummerOlympics());
        System.out.println(getWinterOlympics());
    }
    private String name;
    private int participants;
    public static final int FIRST_OLYMPICS_YEAR = 1896;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public OlympicSport(String name, int participants) {
        setName(name);
        setParticipants(participants);
    }

    public static String getWinterOlympics(){
        Map<Integer, String> winterOlympics = new LinkedHashMap<>();

        try {
            Scanner input = new Scanner(Path.of("src/live_review/week12/olympicSport/winterOlympic"));
            input.useDelimiter("  |\n");
            while (input.hasNextLine()){
                int year = input.nextInt();
                String place = input.nextLine();
                winterOlympics.put(year, place);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return printable(winterOlympics);
    }
    public static String getSummerOlympics(){
        Map<Integer, String> summerOlympics = new LinkedHashMap<>();

        try {
            Scanner input = new Scanner(Path.of("src/live_review/week12/olympicSport/winterOlympic"));
            input.useDelimiter("  |\n");
            while (input.hasNextLine()){
                int year = input.nextInt();
                String place = input.nextLine();
                summerOlympics.put(year, place);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return printable(summerOlympics);
    }

    private static String printable(Map<Integer, String> map){
        String result = "";
        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            result += eachEntry.getKey() + ":" + eachEntry.getValue() + "\n";
        }
        return result;
    }
    public abstract void compete();

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
