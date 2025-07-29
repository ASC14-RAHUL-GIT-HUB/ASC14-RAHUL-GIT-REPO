package com.ecz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {
    private static Connection connection;

    private DbConnectionSingleton() {
        // to be updated
    }

    public static Connection getInstance() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/labd", "root", "mysqlroot");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());;
            }
        }
        return connection;
    }
}
