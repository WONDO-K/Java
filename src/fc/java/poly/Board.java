package fc.java.poly;

public class Board extends Object{ // Object 클래스내에는 toString() 메서드가 존재한다.
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        System.out.println(super.toString()); // -> 부모의 toString을 사용하고 싶을 때 상위 클래스의 메서드를 호출하는 것
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
