package fc.java.poly;

public class ObjectPolyArr {
    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열을 생성
        // 다형성 배열
        Object[] obj = new Object[2];
        obj[0] = new A(); // Upcasting
        //((A)obj[0]).printGo();
        obj[1] = new B(); // Upcasting
        display(obj);
        //((B)obj[1]).printGo();
//        for(int i=0;i< obj.length;i++){
//            if (obj[i] instanceof A){
//                ((A)obj[i]).printGo();
//            } else if (obj[i] instanceof B) {
//                ((B)obj[i]).printGo();
//            }
//        }
    }


    private static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).printGo();
            } else if (obj[i] instanceof B) {
                ((B) obj[i]).printGo();
            }
        }
    }
}
