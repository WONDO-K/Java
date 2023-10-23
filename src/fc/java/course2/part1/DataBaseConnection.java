package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MSSQLDriver;
import fc.java.model2.MySQLDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");

        conn = new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test","system","12345");

        conn = new MSSQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem","ss","12345");
    }
}
