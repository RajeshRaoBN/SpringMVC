import java.sql.*;

public class Driver4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "root";
        try {
            // 1. Get connection to database
            Connection myConn = DriverManager.getConnection(url, user, password);
            // 2. Prepare a statement
            Statement myStmt = myConn.prepareStatement("select * from employees where last_name=? ");

            // 3. Set the parameters
            ((PreparedStatement) myStmt).setString(1, "Aingworth");

            // 4. Execute SQL Query
            ResultSet myRS =((PreparedStatement) myStmt).executeQuery();

            // 5. Display the result set
            display(myRS);

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private static void display(ResultSet myRS) {
        try {
            while (myRS.next()) {
                System.out.println(myRS.getString("first_name") + " " + myRS.getString("last_name"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
