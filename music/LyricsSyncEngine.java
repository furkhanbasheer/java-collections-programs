import java.io.*;
import java.util.*;
import java.util.regex.*;

class LyricLine {
    long time;
    String text;

    LyricLine(long time, String text) {
        this.time = time;
        this.text = text;
    }
}

public class LyricsSyncEngine {

    public static void main(String[] args) {

        try {
            List<LyricLine> lyrics = loadLRC("song.lrc");

            System.out.println("🎵 Starting Lyrics Sync...\n");

            long startTime = System.currentTimeMillis();

            for (LyricLine line : lyrics) {

                long currentTime = System.currentTimeMillis() - startTime;
                long waitTime = line.time - currentTime;

                if (waitTime > 0) {
                    Thread.sleep(waitTime);
                }

                System.out.println(line.text);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<LyricLine> loadLRC(String filePath) throws IOException {

        List<LyricLine> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF-8")
        );

        String line;
        Pattern pattern = Pattern.compile("\\[(\\d+):(\\d+\\.\\d+)\\](.*)");

        while ((line = br.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {

                int minutes = Integer.parseInt(matcher.group(1));
                double seconds = Double.parseDouble(matcher.group(2));
                String text = matcher.group(3).trim();

                long timeInMillis = (long) ((minutes * 60 + seconds) * 1000);

                list.add(new LyricLine(timeInMillis, text));
            }
        }

        br.close();

        list.sort(Comparator.comparingLong(l -> l.time));

        return list;
    }
}