package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Hello",1);
        System.out.println(pair.getKey()); // hello
        System.out.println(pair.getValue()); // 1

        // 검색을 빠르게 할 수 있다.
        Map<String,Integer> maps = new HashMap<>();
        maps.put("kor",60);
        maps.put("eng", 80);
        maps.put("mat", 70);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("mat"));

    }
}
