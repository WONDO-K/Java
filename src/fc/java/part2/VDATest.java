package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        // 정수 한 개를 저장하기 위한 변수를 선언하시오.
        int v; // 변수 선언 -> 기억공간
        v=10;
        System.out.println("v = " + v);
        // 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장
        int a = 10; // 변수 초기화
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        // sum이라느 변수에 1~5까지의 수를 누적해서 출력하시오.
        int sum=0; // 초기화
        sum=sum+1;
        sum=sum+2;
        sum=sum+3;
        sum=sum+4;
        sum=sum+5;

        System.out.println("sum = " + sum);

        // x=10, y=20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시오
        int x = 10;
        int y = 20;
        int temp;

        temp=x;
        x=y;
        y=temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
