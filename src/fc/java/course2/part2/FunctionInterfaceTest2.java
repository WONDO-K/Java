package fc.java.course2.part2;

import fc.java.model2.MathOperation;
import fc.java.model2.MathOperationImpl;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        // MathOperation 인터페이스를 내부 익명(내부)클래스로 구현해보기.
        MathOperation mo = new MathOperation(){ // 인터페이스는 존재하지만 구현부는 존재하지 않는 익명 클래스
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
    }
}
