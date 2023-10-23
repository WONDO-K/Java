package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        // 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오 (인스턴스를 만드시오)
        // fc.java.part2.Book:타입, b:변수,인스턴스(변수), 참조형 변수 = new fc.java.part2.Book():번지
        // b는 정보가 저장되는 번지를 가르키고 있기 때문에 b를 통해 정보에 접근해야 한다.
        Book b = new Book(); // Book이라는 설계도에 따라 객체를 생성한다.
        b.title = "자바";
        b.price = 30000;
        b.company = "패캠";
        b.author = "최동호";
        b.page = 700;
        b.isbn = "1199110";
        System.out.println(b.title +"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn);
    }
}
