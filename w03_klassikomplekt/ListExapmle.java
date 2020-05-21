import java.util.*;
/**
 * ListExapmle
 */
public class ListExapmle {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<Integer>(); 
        newList.add(6);
        newList.add(7);
        newList.add(8);
        newList.add(9);
        System.out.println(newList);

        newList.remove(2);
        System.out.println(newList);
        System.out.println(newList.get(2));
        
    }
    
}