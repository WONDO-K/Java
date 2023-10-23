package fc.java.part4;

import fc.java.part4.Employee;

public class RempVO extends Employee {
    public RempVO(){
        super(); // 상위 클래스의 생성자를 호출한다.
    }
    public RempVO(String name,int age, String phone, String empDate, String dept, boolean marriage){
        // 정보은닉 반영
        super(name,age,phone,empDate,dept,marriage); // 부모 생성자 호출

    }
}
