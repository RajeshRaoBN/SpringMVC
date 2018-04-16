import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Driver3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "root";
        try {
            // 1. Get connection to database
            Connection myConn = DriverManager.getConnection(url, user, password);
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();

            // 3. Execute SQL Query
            String sql = "delete from departments where dept_no='d011'";
            int rowsAffected = myStmt.executeUpdate(sql);

            System.out.println("Rows Affected: " + rowsAffected);
            System.out.println("Delete complete");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
