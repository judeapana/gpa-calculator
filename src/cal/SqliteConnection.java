/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jude
 */
public class SqliteConnection {
    private static Connection conn = null;
    public static Connection pushConn() throws ClassNotFoundException{
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:GPADatabase.db");
            return conn;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
