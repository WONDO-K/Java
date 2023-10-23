package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John",30);
        Gson gson = new Gson();
        String json = gson.toJson(person); // JSON 포멧으로 변환해주는 메서드
        System.out.println(json); // {"name":"John","age":30}

    }

}
