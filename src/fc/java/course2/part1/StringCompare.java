package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교 예제 코드
        String str1 = "Hello";
        String str2 = "World";

        if(str1.equals(str2)){
            System.out.println("두 문지열은 같다");
        } else {
            System.out.println("두 문자열은 다르다.");
        }

        // compareTo() 메서드를 사용한 문자열 비교 예제 코드
        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4);

        if(result==0){
            System.out.println("두 문자열은 같다");
        }else if (result<0){
            System.out.println("str3이 str4보다 앞에 있다.");
        } else {
            System.out.println("str4이 str3보다 앞에 있다.");
        }
    }
}
