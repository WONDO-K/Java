package fc.java.model;

public class CarUtility {
    public void carInfoPrint(CarDTO carDto){
        System.out.println(carDto.carSn + "\t" + carDto.carName + "\t" + carDto.carPrice + "\t" + carDto.carOwner + "\t" + carDto.carYear + "\t" + carDto.carType);
    }
}
