package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        //Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하시오
        int carSn = 1110;
        String carName = "BMW 520d";
        int carPrice = 90000000;
        String carOwner = "최동호";
        int carYear = 2020;
        String carType = "G";

        // 데이터를 하나로 묶는다.
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        //carPrint(car);

        CarUtility carUtility = new CarUtility();
        carUtility.carInfoPrint(car);


    }
    // 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
//    public static void carPrint(CarDto carDto){
//        System.out.println(carDto.toString());
//    }
}
