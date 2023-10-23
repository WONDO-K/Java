package fc.java.poly;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 부모가 명령을 내리면 오작동을 한다.
        // [다형성을 보장하지 않음] -> 그러면 다형성을 보장하려면? -? 재정의를 강제로 하도록 만들어 주면 된다.
        // 추상클래스, 인터페이스
        Animal ani = new Dog();
        ani.eat(); // -> ?가 출력되기 떄문에 다형성 보장 x

        ani = new Cat();
        ani.eat();
    }
}
