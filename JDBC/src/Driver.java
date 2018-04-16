import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        try {
            // 1. Get connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");

            // 2. Create a statement
            Statement myStmt = myConn.createStatement();

            // 3. Execute SQL Query
            ResultSet myRS = myStmt.executeQuery("SELECT * FROM employees LIMIT 5");

            // 4. Process the result set
            while (myRS.next()) {
                System.out.println(myRS.getString("first_name") + " " + myRS.getString("last_name"));
            }

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}
