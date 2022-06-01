package practice;

import java.sql.*;

public class insertion {

    public static void main(String [] args) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1","root","");

        Statement statement =connection.createStatement();
        String query ="INSERT INTO `PEOPLE` (`id`, `name`, `address`) VALUES ('42101', 'rameen', 'milaan');";
        int rs = statement.executeUpdate(query);

    }
}
