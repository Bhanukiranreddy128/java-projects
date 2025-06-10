package Bhanu128;

import java.sql.*;

public class JDBCTestEx {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "1234");

            // Use REPLACE INTO with column names
            String insertSQL = "REPLACE INTO STUDENTS (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            Object[][] students = {
                    {3306, "bhagya", 89},
                    {3307, "bhanu", 94},
                    {3308, "bhargavi", 97},
                    {3309, "chaitanya", 83},
                    {3312, "dada", 45}
            };

            // Insert records
            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.setInt(3, (int) student[2]);
                pstmt.executeUpdate();
            }

            // Retrieve and display data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student List: ");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name")+" "+rs.getInt("marks"));
            }

            // Clean up
            rs.close();
            stmt.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}