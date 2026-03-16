
import java.util.*;
public class list_frequency {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple","mango","apple","orange","mango","apple"
        );

        Map<String,Integer> map = new HashMap<>();

        for(String item : list) {

            if(map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            }
            else {
                map.put(item, 1);
            }

        }

        System.out.println(map);
    }
}