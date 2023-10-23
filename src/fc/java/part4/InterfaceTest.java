package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.Tv;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio, Tv 작동
        // 다형성이 100% 보장이된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        // 인터페이스는 객체로 생성할 수 없다.-> new 사용 X
        // 부모의 역할은 수행가능하다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // -> 오동작

        remo = new Tv();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // -> 오동작
    }
}
