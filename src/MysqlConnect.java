import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 * Singleton Class for MySql Connection
 */
public class MysqlConnect {

    public Connection           connection;
    private Statement           statement;
    private static MysqlConnect instance;

    /**
     * Private constructor
     *
     * @throws Exception
     */
    private MysqlConnect() throws Exception {

        String database_host = "jdbc:mysql://localhost:3306/";
        String database_name = "technical_test";
        String database_user = "root";
        String database_password = "";

        String driver = "com.mysql.jdbc.Driver";
        String disableSSL = "?useSSL=false";

        Class.forName(driver).newInstance();
        this.connection = (Connection)DriverManager.getConnection(database_host + database_name + disableSSL, database_user, database_password);
    }

    /**
     * Access point to unique instance
     *
     * @return MysqlConnect Object
     * @throws Exception
     */
    public static MysqlConnect getInstance() throws Exception {

        return instance = new MysqlConnect();
    }

    /**
     * Method to get data from database
     *
     * @param query String Query to be executed
     * @return a ResultSet object containing the results
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException {

        statement = instance.connection.createStatement();
        return statement.executeQuery(query);
    }

    /**
     * Method to insert data to a table
     *
     * @param query String Query to be executed
     * @return boolean
     * @throws SQLException
     */
    public int insert(String query) throws SQLException {

        statement = instance.connection.createStatement();
        return statement.executeUpdate(query);
    }
}
