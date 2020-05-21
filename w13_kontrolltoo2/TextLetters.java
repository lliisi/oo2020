
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.net.Socket;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.List;



public class TextLetters {
    private final List<String> words;
    private final Map<String, Integer> endings = new HashMap<>();

    TextLetters(final String text) {
        this.words = Arrays.asList(text.split(" "));
    }

    public void printTextLastLetters() {
        for (String w : words) {
            w = w.toLowerCase().replaceAll("[+.-:,]", "");
            System.out.print(w);
            w = w.substring(w.length() - 1, w.length());

            if (endings.keySet().contains(w)) {
                endings.put(w, endings.get(w) + 1);
            } else {
                endings.put(w, 1);
            }
            System.out.print(" - " + w +"\n");

        }
    }
}