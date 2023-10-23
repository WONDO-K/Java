package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장
        //Integer aa = new Integer(10); // 사용자 정의 자료형
        Integer aa = 10; // 내부에서 Auto-boxing이 이루어진다. 10->new Integer(10);
        System.out.println(aa.intValue()); // unboxing : Integer->int 객체에서 int 값을 추출하는 것

        Integer bb = new Integer(20); // Auto-boxing
        int b = bb; // Integer안에 저장되어 있는 int값 20을 자동으로 꺼내어 b에 저장해준다 Auto-unboxing이 수행된다.

        float f = 10.5f;
        //Float ff = new Float(45.5f);
        Float ff = 45.5f; // new Float(45.5f); // Auto-boxing
        System.out.println(ff.floatValue());

        Float af = 49.1f;
        System.out.println(af.floatValue());
        float aff = af; // af.floatValue(); -> Auto-unboxing
        System.out.println(aff);
    }
}
