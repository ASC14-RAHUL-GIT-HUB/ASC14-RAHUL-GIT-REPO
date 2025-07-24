package in.demo.jdbcLab_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Friend {
    private int id;
    private String fullName;
    private String email;
    private long phone;

    public Friend(int id, String fullName, String email, long phone) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    // Getters
    public int getId() { 
        return id;
    }
    public String getFullName() { 
        return fullName;
    }
    public String getEmail() { 
        return email;
    }
    public long getPhone() { 
        return phone;
    }
}

class DBConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=myFriendsDb;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASS = "sqlserver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

class FriendDAO {

    public void addFriend(Friend friend) throws Exception {
        String query = "INSERT INTO friendsTst VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, friend.getId());
            ps.setString(2, friend.getFullName());
            ps.setString(3, friend.getEmail());
            ps.setLong(4, friend.getPhone());

            ps.executeUpdate();
        }
    }

    public List<Friend> getAllFriends() throws Exception {
        List<Friend> friends = new ArrayList<>();
        String query = "SELECT * FROM friendsTst";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                friends.add(new Friend(
                    rs.getInt("ID"),
                    rs.getString("fullName"),
                    rs.getString("emailAddr"),
                    rs.getLong("phoneNumber")));
            }
        }
        return friends;
    }

    public boolean updateFriend(Friend friend) throws Exception {
        String query = "UPDATE friendsTst SET fullName = ?, emailAddr = ?, phoneNumber = ? WHERE ID = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, friend.getFullName());
            ps.setString(2, friend.getEmail());
            ps.setLong(3, friend.getPhone());
            ps.setInt(4, friend.getId());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean deleteFriend(int id) throws Exception {
        String query = "DELETE FROM friendsTst WHERE ID = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }
}

public class JdbcLabAdvanced {

    private static final Scanner scanner = new Scanner(System.in);
    private static final FriendDAO dao = new FriendDAO();

    public static void main(String[] args) {
        System.out.println("Welcome to the Advanced Friend Management System");

        while (true) {
            printMenu();
            int choice = getChoice();

            try {
                switch (choice) {
                    case 1 : addFriend();
                    break;
                    case 2 : viewFriends();
                    break;
                    case 3 : updateFriend();
                    break;
                    case 4 : deleteFriend();
                    break;
                    case 5 : exitApp();
                    break;
                    default : System.out.println("Invalid Choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n~~ FRIEND MANAGEMENT ~~");
                System.out.println("1. Add Them");
                System.out.println("2. View Them");
                System.out.println("3. Update Them");
                System.out.println("4. Delete Them");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addFriend() throws Exception {
        while (true) {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Full Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = Long.parseLong(scanner.nextLine());

            dao.addFriend(new Friend(id, name, email, phone));
            System.out.println("Friend added successfully!");

            System.out.print("Do you want to add another? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) break;
        }
    }

    private static void viewFriends() throws Exception {
        List<Friend> friends = dao.getAllFriends();

        System.out.printf("\n%-5s %-25s %-30s %-15s\n", "ID", "Name", "Email", "Phone");

        for (Friend f : friends) {
            System.out.printf("%-5d %-25s %-30s %-15d\n",
                    f.getId(), f.getFullName(), f.getEmail(), f.getPhone());
        }
    }

    private static void updateFriend() throws Exception {
        System.out.print("Enter ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter New Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter New Phone: ");
        long phone = Long.parseLong(scanner.nextLine());

        boolean updated = dao.updateFriend(new Friend(id, name, email, phone));
        System.out.println(updated ? "Updated successfully!" : "Friend not found.");
    }

    private static void deleteFriend() throws Exception {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean deleted = dao.deleteFriend(id);
        System.out.println(deleted ? "Friend deleted successfully!" : "Friend not found.");
    }

    private static void exitApp() {
        System.out.println("Program Exiting");
        scanner.close();
        System.exit(0);
    }
}
