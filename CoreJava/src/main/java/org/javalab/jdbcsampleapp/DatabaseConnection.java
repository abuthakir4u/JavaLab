package org.javalab.jdbcsampleapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public final static String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    public final static String DB_USERNAME = "root";
    public final static String DB_PASSWORD = "Bot$%^01";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER_CLASS);
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return con;
    }
}
