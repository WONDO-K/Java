package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 회원 정보를 저장할 객체(인스턴스) 생성
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(40);
        vo.setPhone("010-1234-5678");

        System.out.println(vo.toString());
    }
}
