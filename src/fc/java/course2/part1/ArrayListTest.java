package fc.java.course2.part1;

import fc.java.model2.B;
import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력
        // Book[], Object[]

        ArrayList list = new ArrayList(); // 기본크기 (10)
        // List list = new ArrayList(); // 기본크기 (10) -> 이렇게 사용가능
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",16000,"대림","이길동"));
        list.add(new Book("Python",17000,"정보","나길동"));

        Book book = (Book)list.get(0); // Book<---(Book)Object
        System.out.println(book.toString());

        book = (Book)list.get(1);
        System.out.println(book.toString());

        book = (Book)list.get(2);
        System.out.println(book.toString());

        for(int i=0;i<list.size();i++){
            Book b = (Book)list.get(i);
            System.out.println(b); //-> .toString()이 생략되어 있다.
        }

    }
}
