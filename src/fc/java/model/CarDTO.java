package fc.java.model;

public class CarDTO {
    public int carSn;
    public String carName;
    public int carPrice;
    public String carOwner;
    public int carYear;
    public String carType;

    @Override
    public String toString() {
        return "CarDto{" +
                "carSn=" + carSn +
                ", carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carOwner='" + carOwner + '\'' +
                ", carYear=" + carYear +
                ", carType='" + carType + '\'' +
                '}';
    }
}
