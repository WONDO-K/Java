package fc.java.part3;

import fc.java.model.MyUtil1;

public class StaticAccess{
    public static void main(String[] args){
        int a=10;
        int b=20;
        int sum = MyUtil1.hap(a,b); // 호출 방법 : 클래스이름.메서드이름 "." 도트 연산자 사용!
        System.out.println(sum);
    }
}