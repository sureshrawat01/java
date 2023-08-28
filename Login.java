import java.sql.*;

class JDBCExample {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/suresh";
        String USER = "root";
        String PASS = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "Insert customer(code, name) values(101, 'sanju')";
            stmt.executeUpdate(sql);
            System.out.println("Table update successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

