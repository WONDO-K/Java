package fc.java.model2;

// 함수형 인터페이스
@FunctionalInterface
public interface MathOperation {
    public int operation(int x, int y); // 추상메서드 -> 구현부가 없다. 또한 함수형 인터페이스는 추상메서드를 1개만 가질 수 있다.

}
