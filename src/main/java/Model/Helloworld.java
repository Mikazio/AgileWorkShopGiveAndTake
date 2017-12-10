/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utility.ConnectionBuilder;

/**
 *
 * @author VARINTITARAT
 */
public class Helloworld {
    
    public static String connection() throws SQLException, ClassNotFoundException {
        String returnValue = "";
        String databaseCommand = "select * from helloworld";
        ConnectionBuilder connector = new ConnectionBuilder();
        Connection toDatabase = connector.connectionBuilder();
        PreparedStatement statement = toDatabase.prepareStatement(databaseCommand);
        ResultSet ActualResult = statement.executeQuery();
        while(ActualResult.next()) {
            returnValue = ActualResult.getString("text");
        }
        return returnValue;
    }
}
