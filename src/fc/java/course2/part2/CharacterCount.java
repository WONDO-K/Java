package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o', ....}

        for (char c : strArray){
            if (charCountMap.containsKey(c)){ // containsKey() -> 파라미터의 값이 포함되어 있는지 t/f로 반환
                charCountMap.put(c,charCountMap.get(c)+1); // 현재 키의 값을 뽑아와 1을 더하고 다시 put한다.
            } else { // 키가 없으면 삽입한다.
                charCountMap.put(c,1);
            }
        }
        System.out.println("Character Counts");
        for ( char c : charCountMap.keySet()){ // keySet() -> 키를 모두 추출한다.
            System.out.println(c + ":" + charCountMap.get(c));
        }
    }
}
