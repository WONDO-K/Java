package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 객체 생성
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 요소는 추가되지 않는다.

        System.out.println(set.size()); // 3이 출력된다.

        for(String element : set){
            System.out.println(element);
        }

        set.remove("Banana");

        for(String element : set){
            System.out.println(element);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("Set contains Cherry? " + contains); // true

        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("Set is empty? " + empty);
    }
}
