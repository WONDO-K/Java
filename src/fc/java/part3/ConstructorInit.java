package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // q. 생성자 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력
        PersonVO p = new PersonVO("홍길동",20,"010-1111-1111");
        System.out.println(p.toString()); // 값은 생성자에서 이미 초기화 했기 때문에 출력이 가능하다.
        System.out.println(p);

        // 개발자가 원하는 값으로 초기화하는 방법

    }
}
