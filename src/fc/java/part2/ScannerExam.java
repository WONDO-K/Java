package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서 정보 입력 받기.
        Scanner sc =  new Scanner(System.in);
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격 : ");
        int price = sc.nextInt();
        System.out.println("price = " + price);

        sc.nextLine(); // 버퍼비우기

        System.out.print("출판사 : ");
        String company = sc.nextLine();
        System.out.println("company = " + company);

        System.out.print("저자 : ");
        String author = sc.nextLine();
        System.out.println("author = " + author);

        System.out.print("페이지수 : ");
        int page = sc.nextInt();
        System.out.println("page = " + page);

        sc.nextLine();

        System.out.print("ISBN : ");
        String isbn = sc.nextLine();
        System.out.println("isbn = " + isbn);

    }
}
