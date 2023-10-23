package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        NoneStaticTest nst = new NoneStaticTest();
        int a=10;
        int b=20;
        int result = nst.hap(a,b);
        System.out.println(result);

    }

    public int hap(int a, int b){ // non static 메서드이기 떄문에 static 블럭에서 객체생성없이 호출이 불가능하다
        int v = a+b;
        return v;
    }
}
