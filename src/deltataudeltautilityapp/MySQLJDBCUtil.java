
package deltataudeltautilityapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLJDBCUtil
{
    public static Connection getConnection() throws SQLException
    {
        Connection conn = null;
        conn = DriverManager.getConnection(DBProperties.url, DBProperties.user, DBProperties.password);
        return conn;
    }
}
