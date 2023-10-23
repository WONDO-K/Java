package fc.java.course2.part1;

import fc.java.model2.BB;
import fc.java.model2.CC;

public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB(); // BB의 로직을 모르기 때문에 BB를 CC타입으로 업캐스팅하여 객체를 생성한다.
        c.x();
        c.y();
        c.z(); // CC의 기능들을 BB들이 재정의 했기 때문에 실행 시점에 자식의 재정의된 메서드를 실행한다 -> 동적 바인딩.
    }
}
