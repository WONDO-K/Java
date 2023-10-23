package fc.java.model2;

//BB는 노출 시키지 않는다.
public class BB implements CC{
    @Override
    public void x() {
        System.out.println("x 동작 실행");
    }

    @Override
    public void y() {
        System.out.println("y 동작 실행");
    }

    @Override
    public void z() {
        System.out.println("z 동작 실행");
    }
}
