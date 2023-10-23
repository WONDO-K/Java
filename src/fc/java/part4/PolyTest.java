package fc.java.part4;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성
        // 상속관계, 하위클래스가 상위클래스의 메서드를 재정의(오버라이딩)이 되어 있어야 한다, 동적바인딩(실행되는 시점에 사용할 메서드가 결정되는 것)
        Animal ani = new Dog();
        ani.eat(); // 컴파일 시점에는 Animal이지만 재정의를 했을 시 실행 시점에 Dog의 eat를 실행한다.(동적바인딩)

        ani = new Cat();
        ani.eat();
        // DownCasting 해야함
        ((Cat)ani).night();
        // Overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩을 말한다.
        // -> 프로그램의 실행 속도와는 무관하다.
        // Override(오버라이드,재정의) : 실행시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와의 관계가 존재한다.
        // -> 왜? 실행될 메서드를 클래스에서 탐색해야하는 시간이 소요된다.
    }
}
