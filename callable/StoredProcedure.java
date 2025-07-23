package in.demo.callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedure {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=myFriendsDb;user=sa;password=sqlserver;encrypt=true;trustServerCertificate=true;";

            conn = DriverManager.getConnection(url);
            System.out.println("Connection Established!");

            // Prepare and execute stored procedure call
            cstmt = conn.prepareCall("{call GetAllFriends()}");
            rs = cstmt.executeQuery();

            // Print results
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String email = rs.getString("emailAddr");
                String phone = rs.getString("phoneNumber");

                System.out.println("ID: " + id + ", Name: " + fullName + ", Email: " + email + ", Phone: " + phone);
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Closed MSSQL Connection!");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
