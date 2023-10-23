package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person(); // 메모리에 person 객체를 생성
        p.name = "홍길동";
        p.age = 20;
        p.phone = "010-1234-5678";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
