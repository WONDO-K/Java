package fc.java.poly;

public class Dog extends Animal { //Animal-> eat(){ ? }
    // 재정의 하지 않음 - > 오류
    // 재정의를 반드시 해야한다 -> 구현부를 구현해야한다 (바디 부분)

    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
