import java.util.*;
/**
 * SetExample
 */
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> newSet = new HashSet<>();
        newSet.add(4);
        newSet.add(4);
        newSet.add(9);
        newSet.add(9);
        newSet.add(9);
        newSet.add(66);
        newSet.add(66);
        newSet.add(67);
        newSet.add(91);
        newSet.add(91);
        newSet.add(91);

        System.out.println(newSet);
    }
}