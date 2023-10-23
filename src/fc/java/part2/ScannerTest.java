package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        System.out.println("실수를 입력하시오");
        float f = sc.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열를 입력하시오");
        String str = sc.next();
        System.out.println("str = " + str);

        sc.nextLine(); // 버퍼 비우기

        System.out.println("문자열를 입력하시오");
        String str1 = sc.nextLine();
        System.out.println("str1 = " + str1);

        sc.close(); // 스트림을 끊어준다.
    }
}
