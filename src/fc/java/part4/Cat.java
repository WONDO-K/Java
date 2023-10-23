package fc.java.part4;

public class Cat extends Animal {

    public Cat(){ // 기본 생성자 또한 생략
        super(); // 생략
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }

    public void night(){
        System.out.println("밤에 눈동자가 빛난다");
    }
}
