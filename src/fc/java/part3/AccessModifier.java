package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동";
        dto.phone = "010-1234-5678";
        // dto.age=100; // 에러발생 (접근제하자 때문에 접근 불가)
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
