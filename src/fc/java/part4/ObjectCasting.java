package fc.java.part4;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal -> Dog,Cat
            Animal ani = new Dog(); // 업캐스팅
            ani.eat();

            ani = new Cat();
            ani.eat();
//            Cat c = (Cat) ani;
//            c.night();
        ((Cat)ani).night(); // 위의 코드를 한 줄로 표현
    }
}
