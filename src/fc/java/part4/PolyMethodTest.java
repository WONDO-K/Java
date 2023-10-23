package fc.java.part4;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

//    private static void display(Cat c) {
//        c.eat();
//    }
//
//    private static void display(Dog d) {
//        d.eat();
//    }

    private static void display(Animal ani){
        ani.eat();
        // Cat 타입으로 받은 경우에만 실행해야한다. -> If 문을 사용해야할 필요가 생겼다.
        if(ani instanceof Cat){ // ani라는 타입이 Cat으로부터 인스터스가 만들어 졌다면.-> 타입 확인 연산자 (T/F)로 결과 리턴
            ((Cat)ani).night();;
        }

    }

}
