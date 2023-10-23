package fc.java.model3;

import com.google.gson.Gson;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@example.com\"}";

        // JSON -> Object(Member)
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class); //(json 데이터 포멧, 어떤 객체로 변환할 것인가?)
        System.out.println("mvo = " + mvo); // mvo의 toString에 의해 값 출력
    }
}
