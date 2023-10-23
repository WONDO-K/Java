package fc.java.poly;
// 추상 클래스 (불완전 클래스) -> 혼자서는 객체를 생성할 수 없다.
public abstract class Animal {
    public abstract void eat(); // 추상메서드(불완전한 메서드) : 메서드의 구현부가 없다
    //구현메서드
    public void move(){
        System.out.println("무리를 지어서 이동한다.");
    }
}
