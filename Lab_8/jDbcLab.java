package in.demo.jdbcLab_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jDbcLab {
    public static void main(String[] args) {

        Connection conn = null;
        Scanner scanner = new Scanner(System.in);

        try {

            // Class forName is used to load the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=myFriendsDb;user=sa;password=sqlserver;encrypt=true;trustServerCertificate=true;";
            // Driver Manager is used to establish a connection
            // getConnection() method is called to create a connection to the database
            // The connection URL, username, and password are passed as parameters

            conn = DriverManager.getConnection(url);
            System.out.println("Connection Established!");

            Statement stmt = conn.createStatement();
            // Statement object is created
            // It is used to execute SQL queries

            while (true) {
                System.out.println("\n~~ Friend Management ~~");
                System.out.println("1. Add Friend");
                System.out.println("2. View Friends");
                System.out.println("3. Update Friend");
                System.out.println("4. Delete Friend");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                // choice is taken from user input

                switch (choice) {
                    case 1:
                        while (true) {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(scanner.nextLine());

                            System.out.print("Enter Full Name: ");
                            String name = scanner.nextLine();

                            System.out.print("Enter Email Address: ");
                            String email = scanner.nextLine();

                            System.out.print("Enter Phone Number: ");
                            long phone = Long.parseLong(scanner.nextLine());

                            String insertQuery = "INSERT INTO friendsTst VALUES (?, ?, ?, ?)";
                            PreparedStatement psInsert = conn.prepareStatement(insertQuery);
                            psInsert.setInt(1, id);
                            psInsert.setString(2, name);
                            psInsert.setString(3, email);
                            psInsert.setLong(4, phone);
                            psInsert.executeUpdate();

                            System.out.println("Friend Added Successfully!");

                            System.out.print("Do you want to add another friend? (yes/no): ");
                            String cont = scanner.nextLine().trim().toLowerCase();
                            if (!cont.equals("yes")) {
                                break;
                            }
                        }
                        break;
                        // Friend details are inserted into the database
                        // PreparedStatement is used for parameterized queries
                        // It helps prevent SQL injection attacks
                        // The executeUpdate() method is called to perform the insert operation

                    case 2:
                        String selectQuery = "SELECT * FROM friendsTst";
                        ResultSet rs = stmt.executeQuery(selectQuery);
                        System.out.println("ID\tName\t\tEmail\t\t\tPhone");
                        while (rs.next()) {
                            System.out.printf("%d\t%s\t\t%s\t\t%d\n",
                                    rs.getInt("ID"),
                                    rs.getString("fullName"),
                                    rs.getString("emailAddr"),
                                    rs.getLong("phoneNumber"));
                        }
                        break;
                        // The ResultSet is iterated to display each friend's details
                        // The getXXX() methods are used to retrieve values from the ResultSet

                    case 3:
                        System.out.print("Enter ID to Update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter New Email: ");
                        String newEmail = scanner.nextLine();

                        System.out.print("Enter New Phone: ");
                        long newPhone = Long.parseLong(scanner.nextLine());

                        String updateQuery = "UPDATE friendsTst SET fullName = ?, emailAddr = ?, phoneNumber = ? WHERE ID = ?";
                        PreparedStatement psUpdate = conn.prepareStatement(updateQuery);
                        psUpdate.setString(1, newName);
                        psUpdate.setString(2, newEmail);
                        psUpdate.setLong(3, newPhone);
                        psUpdate.setInt(4, updateId);
                        int rowsUpdated = psUpdate.executeUpdate();
                        if (rowsUpdated > 0)
                            System.out.println("Friend Details Updated Successfully!");
                        else
                            System.out.println("No Friend Found with ID: " + updateId);
                        break;
                        // The update operation is performed using PreparedStatement
                        // It helps prevent SQL injection attacks
                        // The executeUpdate() method is called to perform the update operation

                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());

                        String deleteQuery = "DELETE FROM friendsTst WHERE ID = ?";
                        PreparedStatement psDelete = conn.prepareStatement(deleteQuery);
                        psDelete.setInt(1, deleteId);
                        int rowsDeleted = psDelete.executeUpdate();
                        if (rowsDeleted > 0)
                            System.out.println("Friend Deleted Successfully!");
                        else
                            System.out.println("No Friend Found with ID: " + deleteId);
                        break;
                        // The executeUpdate() method is called to perform the delete operation

                    case 5:
                        System.out.println("Exiting...");
                        conn.close();
                        scanner.close();
                        System.out.println("Closed Scanner and MSSQL Connection!");
                        System.exit(0);
                        // The scanner and connection are closed to release resources (very important)

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();   // very imp to close the connection before program exits abruptly
                    System.out.println("Closed MSSQL Connection!");
                    scanner.close();
                    System.out.println("Closed Scanner!");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


/*
 * JDBC Lab - Friend Management System
 * This program demonstrates basic CRUD operations using JDBC.
 * It allows users to create, read, update, and delete friend records in a database.
 * 
 * The program uses JDBC API for database connectivity and SQL statements for CRUD operations.
 *
 * The main class is `jDbcLab` and it contains a menu-driven interface for user interaction.
 */