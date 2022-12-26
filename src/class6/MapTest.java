package class6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 30);
        map.put("car", null);

        System.out.println(map.get("age"));

        map.remove("car");
        map.put("car", null);
        System.out.println(map);

    }
}
