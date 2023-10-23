package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println(a.length);

        char[] c = {'A','P','P','L','E'};

        for (int i=0;i<c.length;i++){
            System.out.print((char)(c[i]+32));
        }
    }
}
