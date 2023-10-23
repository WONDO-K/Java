package fc.java.model;

public class AllStatic {
    private AllStatic(){ // -> 기본 설정자를 private로 설정하여 접근을 막는다.

    }
    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }
    public static int max(int a, int b){
        return a>b? a:b;
    }
    public static int min(int a, int b){
        return a<b? a:b;
    }
}
