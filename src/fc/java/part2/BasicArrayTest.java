package fc.java.part2;

public class BasicArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book();
        b[0].title = "자바";
        b[0].price = 30000;
        b[0].company = "패캠";
        b[0].author = "최동호";
        b[0].page = 700;
        b[0].isbn = "1199110";
        System.out.println(b[0].title +"\t"+b[0].price+"\t"+b[0].company+"\t"+b[0].author+"\t"+b[0].page+"\t"+b[0].isbn);

        b[1] = new Book();
        b[1].title = "자바";
        b[1].price = 30000;
        b[1].company = "패캠";
        b[1].author = "최동호";
        b[1].page = 700;
        b[1].isbn = "1199110";

        System.out.println(b[1].title +"\t"+b[1].price+"\t"+b[1].company+"\t"+b[1].author+"\t"+b[1].page+"\t"+b[1].isbn);

        b[2] = new Book();
        b[2].title = "자바";
        b[2].price = 30000;
        b[2].company = "패캠";
        b[2].author = "최동호";
        b[2].page = 700;
        b[2].isbn = "1199110";
        System.out.println(b[2].title +"\t"+b[2].price+"\t"+b[2].company+"\t"+b[2].author+"\t"+b[2].page+"\t"+b[2].isbn);
    }
}
