package fc.java.part3;

import fc.java.model.MyUtil1;
import fc.java.model.MyUtil2;

public class NoneStaticAccess {
    public static void main(String[] args){
        int a=10;
        int b=20;
        MyUtil2 myUtil2 = new MyUtil2();
        int sum = myUtil2.hap(a,b);
        System.out.println(sum);
    }
}
