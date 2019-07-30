package model;
import java.sql.*;
public class Konekcija {
    
    private static Connection conn = null;
    private Konekcija() {}
    public static Connection konekcija() throws SQLException
    {
        if(conn == null) 
        {
            try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                }
            catch(ClassNotFoundException ex){}
            try {
                conn = DriverManager.getConnection
                ("jdbc:mysql://localhost/mydb", "root","Kemo.111");
            } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
            }
        }
        return conn;
    }
}
