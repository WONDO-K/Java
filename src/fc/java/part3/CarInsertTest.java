package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
         // 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = sc.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = sc.nextLine();

        System.out.print("자동차 연식 : ");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 타입 : "); // G(휘발유), D(경유)
        String carType = sc.nextLine();

        CarDTO carDto = new CarDTO();
        carDto.carSn = carSn;
        carDto.carName = carName;
        carDto.carPrice = carPrice;
        carDto.carOwner = carOwner;
        carDto.carYear = carYear;
        carDto.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(carDto);
        dao.carSelect();
    }
}
