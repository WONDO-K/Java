package fc.java.course2.part2;

import fc.java.model2.Converter;
import fc.java.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        // 정적 메서드 참조
        Converter<String,Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123"); // int하면  오토언박싱이 수행되기 떄문에 상관없음
        System.out.println("result = " + result); // 123
    }
}
