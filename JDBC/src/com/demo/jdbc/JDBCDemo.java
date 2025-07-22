package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) {

        Connection connection = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=myFriendsDb;user=sa;password=sqlserver;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection Established!");

            Statement statement = connection.createStatement();
            System.out.println("Statement is Created!");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM friend_s");
            System.out.println("\nResultSet returned");

            while(resultSet.next()) {
                int userId = resultSet.getInt("id");
                System.out.println("\nID: " + userId);
                String email = resultSet.getString("email");
                System.out.println("Email: " + email);
                String last_name = resultSet.getString(3);
                System.out.println("Last Name: " + last_name);
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
