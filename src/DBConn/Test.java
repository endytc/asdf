/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBConn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class Test {

      public static void main(String args[]) throws SQLException {
       // DatabaseConnection conn = new DatabaseConnection();
System.out.println("nvbn");
        try {
            String query = "select * from login";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                System.out.println("username : " + result.getString("username"));
            }
            statement.close();
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage());
        }

    }

}
