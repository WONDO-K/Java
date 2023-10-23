package fc.java.part4;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog와 Cat을 저장하는 배열을 만들기
        Animal[] ani = new Animal[2];
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }

    private static void display(Animal[] ani) {
        for(int i=0;i<ani.length;i++){
            ani[i].eat();
            //((Cat)ani[i]).night();;
        }
    }
}
