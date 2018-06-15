package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    public static final String DB_DRIVER = "org.h2.Driver";
    public static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;INIT=runscript from '~/create.sql'";

    public static Connection getDBConnection(String user, String password) {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION,user,password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return dbConnection;
    }
}
