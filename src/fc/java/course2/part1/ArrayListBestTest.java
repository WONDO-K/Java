package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력
        // Book[], Object[]

        // ArrayList list = new ArrayList(); // 기본크기 (10)
        List<Book> list = new ArrayList<Book>(); // 기본크기 (10) -> 이렇게 사용가능
        // <타입> -> 제네릭이라고 불리는 용법이며 사용가능한 타입을 강제할 때 사용한다.
        // 업캐스팅 다운캐스팅을 할 필요가 없어진다.
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",16000,"대림","이길동"));
        list.add(new Book("Python",17000,"정보","나길동"));

        Book book = list.get(0); // Book<---Object
        System.out.println(book.toString());

        book = list.get(1);
        System.out.println(book.toString());

        book = list.get(2);
        System.out.println(book.toString());

        for(int i=0;i<list.size();i++){
            Book b = list.get(i);
            System.out.println(b); //-> .toString()이 생략되어 있다.
        }

    }
}
