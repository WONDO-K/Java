package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
//        List list = new ArrayList<>(); // Object[]로 생성되기 때문에 다양한 타입이 들어갈 수 있다.
//        list.add(new Movie("괴물","봉준호","2006","한국"));
//        list.add("Hello");
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add(new Movie("기생충", "봉준호", "2019", "한국"));
        list.add(new Movie("완벽한 타인","이재규","2018","한국"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
