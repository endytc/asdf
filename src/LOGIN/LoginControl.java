/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LOGIN;

import DBConn.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class LoginControl {

        private Connection conn;

    public LoginControl(){
    }

    public static boolean getConn(String user, String passw) throws SQLException {
        DatabaseConnection kon = new DatabaseConnection();//
        boolean ok = kon.checkUser(user, passw);
        if (ok == true) {
            return ok;
        } else {
            return false;
        }
    }
}

