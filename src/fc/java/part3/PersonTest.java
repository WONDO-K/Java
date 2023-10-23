package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // 한 사람의 데이터를 저장할 변수를 선언
        // 모델링된 Person 클래스를 이용하여 [객체를 메모라에 생성]
        // 인스턴스를 만드는 과정
        Person p = new Person();

        p.name = "홍길동";
        System.out.println(p.name);
        p.play();
    }
}
