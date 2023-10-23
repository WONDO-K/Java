package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력");
        String str = sc.nextLine();

        String [] strArray = str.split("\\s+");

        for (String s:strArray){
            System.out.println(s);
        }
        sc.close();

    }
}
