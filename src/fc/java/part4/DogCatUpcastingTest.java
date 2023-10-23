package fc.java.part4;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체 사용
        // 부모가 자식을 가리킨다.
        // 업캐스팅
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

    }
}
