package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        String str = new String("HelloWolrd");
        char firstChar = str.charAt(0); // 해당 인덱스와 일치하는 위치의 글자 하나를 리턴받는다
        String replacedString = str.replaceAll("o","X");
        int index = str.indexOf("W"); // 못찾을 경우 -1을 리턴한다.
        int length = str.length();
        String upperCase = str.toUpperCase(); // 대문자로 변환
        String lowerCase = str.toLowerCase(); // 소문자로 변환
        String subString1 = str.substring(5); // 5번째 인덱스부터 끝까지 리턴
        String subString2 = str.substring(5,8); // 5번째 부터 7까지 리턴

        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(subString1);
        System.out.println(subString2);

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

    }
}
