package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상캘르스는 단독으로 객체 생성이 불가능하다.
        // Animal ani = new Animal();
        // ani.eat(); // cannot be instantiated(객체 생성 불가)
        // 추상클래스는 부모의 역할은 수행 가능하다.
        Animal ani = new Dog();
        ani.eat(); // 개처럼 먹다.
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
