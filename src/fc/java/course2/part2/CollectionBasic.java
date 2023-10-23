package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수를 저장하고 출력
        // ArrayLIst -> Object[] <-- X -- int
        // ArrayLIst -> Object[] <-- X -- Integer(Wrapper)
        // ArrayLIst -> Object[] <-- (Auto-boxing:Integer)--int
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // list.add(new Integer(10)); 가 정석이지만 Auto-boxing이 수행된다.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // int <-- Auto-unboxing -- Integer
        for(int data:list){
            System.out.println(data);
        }


    }
}
