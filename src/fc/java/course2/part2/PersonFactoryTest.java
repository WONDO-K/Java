package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
/*        PersonFactory personFactory = Person::new; // 생성자 참조 : Person의 생성자로 정의된 내용에 따라 객체가 생성된다는 의미이다.
        Person person = personFactory.creat("홍길동",40);
        System.out.println(person); */

        // 익명 내부 클래스
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person creat(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory.creat("나길동", 22);
        System.out.println(person);
    }
}
