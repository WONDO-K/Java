package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도 : ");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("윤년");
        }else {
            System.out.println("윤년x");
        }
    }
}
