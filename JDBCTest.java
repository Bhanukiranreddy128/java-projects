package Bhanu128;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connections con = DriverManager.getConnections(
                "jdbc:mysql://localhost:3306/testdb", "root", "1234"
            );

            // SQL query
            String insertSQL = "REPLACE INTO students VALUES(?, ?)";

            // Prepare statement
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            // Students data
            Object[][] students = {
                {1, "Alice"},
                {2, "Bob"},
                {3, "Charlie"},
                {4, "David"},
                {5, "Eve"},
                {6, "Fiona"}
            };

            // Insert data
            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            // Fetch and print data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
