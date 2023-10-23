package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = hap(a,b);
        System.out.println(result);

    }
    // Q. 매개변수로 2개의 정수를 입력 받아서 총합을 구하여 리턴하는 메서드를 정의하시오
    public static int hap(int a, int b){ // static 키워드를 추가하여 메서드 영역에 main과 hap 메서드가 올라갈 수 있게 해준다.
        int v = a+b;
        return v;
    }
}
