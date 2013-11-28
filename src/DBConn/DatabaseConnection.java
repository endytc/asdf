/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBConn;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author asus
 */
public class DatabaseConnection {
 private static String jdbcURL = "jdbc:mysql://localhost:3306/db_jamkesda";
    private static String user = "root";
    private static String password = "";
    private static Connection connection = null;

    public DatabaseConnection() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("koneksi berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkUser(String u, String p) throws SQLException {

        String query = "select * from login where username = '" + u + "' and password = '" + p + "'";
        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);
        while (result.next()) {
            return true;
        }
        statement.close();
//        System.out.println("username dan/atau password salah");
        return false;
    }

    public boolean isConnected() throws SQLException {
        if (getConnection() != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getClosed() throws SQLException {
        if (isConnected()) {
            try {
                getConnection().close();
                setConnection(null);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }

    public String getJdbcURL() {
        return jdbcURL;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConnection(Connection aConnection) {
        this.connection = aConnection;
    }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
//            System.out.println("koneksi berhasil");
        }
//        catch (ClassNotFoundException ex) {
//            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
        catch (Exception ex){
            System.out.println(""+ex.getMessage());
        }
        return connection;
    }
}
