package practice;
import java.sql.*;

public class selection {
    static final String url = "jdbc:mysql://localhost:3306/practice1";
    static final String user = "root";
    static final String password = "";

    public  static void main  (String[] args) throws SQLException
    {
        Connection connection =  DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();

        String query = "select * from PEOPLE";

        ResultSet rs = statement.executeQuery(query);
        boolean flag = false;
        while (rs.next()) {
            flag = true;
            System.out.println(rs.getInt(1) + " " + rs.getString(2) +
                    " " + rs.getString(3));
        }
        if (flag == true) {
            System.out.println("\nRecords retrieved and displayed");
        }
        else
        {
            System.out.println("\n not found");
        }

            connection.close();
        statement.close();
        rs.close();
    }


}
