package fc.java.part4;

public class EmployeeTest  {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력
        RempVO vo = new RempVO("홍길동",33,"010=1111=1111","2022-10-10","홍보부", true);

        // 출력
        System.out.println(vo.toString());
    }
}
