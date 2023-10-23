package fc.java.model;

public class CarDAO {
    public void carInsert(CarDTO car){
        //DB연결, insert SQL
        System.out.println("car 정보가 DB에 입력되었음");
    }
    public void carSelect(){
        // DB연결, select SQL
        System.out.println("car 정보가 출력되었습니다.");
    }

}
