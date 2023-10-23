package fc.java.poly;

public class ObjectPolyTest {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj) { // Upcasting 되었다면 무조건 Downcasting이 이루어져야 한다.
        if (obj instanceof A){ // obj가 A 타입으로부터 생성되었다면
            ((A) obj).printGo();
        } else if (obj instanceof B) { // obj가 B 타입으로부터 생성되었다면
            ((B) obj).printGo();
        }
    }

}
