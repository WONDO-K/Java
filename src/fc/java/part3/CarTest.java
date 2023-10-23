package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야 되는 경우를 생각해보자
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

//        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 여러개의 데이터를 하나의 구조로 합쳐 보내면 더 효율적일 것이다. (DTO, VO)
        // 클래스로 CarDTO, CarVo 모델을 설계
//        carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);
        CarDTO carDto = new CarDTO();
        carDto.carSn = carSn;
        carDto.carName = carName;
        carDto.carPrice = carPrice;
        carDto.carOwner = carOwner;
        carDto.carYear = carYear;
        carDto.carType = carType;

        carInfoPrint(carDto);
    }

    // Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.
    // 받아야할 매개변수가 많아지면 비효율적인 방법이다.
//    public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
//        System.out.println(carSn + "\t" + carName + "\t" + carPrice + "\t" + carOwner + "\t" + carYear + "\t" + carType);
//    }
    public static void carInfoPrint(CarDTO carDto){
        System.out.println(carDto.carSn + "\t" + carDto.carName + "\t" + carDto.carPrice + "\t" + carDto.carOwner + "\t" + carDto.carYear + "\t" + carDto.carType);
        System.out.println(carDto.toString());
    }
}
