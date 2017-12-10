/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author VARINTITARAT
 */
public class ConnectionBuilder {
    public Connection connectionBuilder() throws SQLException, ClassNotFoundException {
        
        Properties p = new Properties();
        p.setProperty("DB_User", "root");
        p.setProperty("DB_Password", "");
        p.setProperty("Database_URL", "jdbc:mysql://127.0.0.1/nelson");
        
        String url = p.getProperty("Database_URL");
        String account = p.getProperty("DB_User");
        String password = p.getProperty("DB_Password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,account,password);
    return con;
    }
}
