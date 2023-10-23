package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;

public class MyBookArray {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",16000,"대림","이길동"));
        list.add(new Book("Python",17000,"정보","나길동"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
