import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver1 {
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
            String sql = "insert into departments "
                    + " (dept_no, dept_name)"
                    + " values('d011', 'Information Technology')";
            myStmt.executeUpdate(sql);

            System.out.println("Insert complete");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
