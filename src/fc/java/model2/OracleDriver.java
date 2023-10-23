package fc.java.model2;
// OracleDriver는 Oracle 회사에서 만들어 재공하면 된다.
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url,username,password를 이용하여 오라클 DB에 접속 시도한다.");
    }
}
