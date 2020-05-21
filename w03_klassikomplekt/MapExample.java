import java.util.*;
/**
 * MapExample
 */
public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> levels = new HashMap<String, String>();
        levels.put("1", "First");
        levels.put("2", "Second");
        levels.put("3", "Third");
        levels.put("4", "Fourth");
        //System.out.println(levels);
        System.out.println(levels.get("2"));
    }

    
}