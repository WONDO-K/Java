package fc.java.part4;

public class Dog extends Animal{

    public Dog(){ // Dog(기본 생성자 또한 원래는 생략되어 있다.)
        super(); //생략 -> new Animal()이 먼저 호출된 이후에 다음 문장들을 실행할 수 있다.
    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다"); // 자식이 부모의 메서드를 본인에 맞게 재구성하여 사용하는 것.
    }
}
