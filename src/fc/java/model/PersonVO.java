package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메서드가 존재한다 -> 기본 생성자 (default Constructor)
    // public PersonVO(){}
    public PersonVO(){
        // 초기화 없음
    }
    public PersonVO(String name, int age, String phone){ // 생성자 오버로딩해서 초기화
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
        // 파라미터 값이 없기 때문에 this 생략 가능
        this.name = "홍길동";
        this.age = 50;
        this.phone = "010-1111-1111";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
