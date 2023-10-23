package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        // (int x, int y)->{return x+y;};
        MathOperation add = (x, y) -> x+y;
        MathOperation multi = (x,y) -> x*y;
        //MathOperation add = (int x, int y)->{return x+y;}; // 타입, return, 중괄호를 생략할 수 도 있다.
        int result = add.operation(10, 20);
        System.out.println("result = " + result);
        int mulresult = multi.operation(10,20);
        System.out.println("mulresult = " + mulresult);

    }
}
