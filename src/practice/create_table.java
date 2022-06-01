package practice;

import java.sql.*;

public class create_table {
     public static void main(String[] args) throws SQLException {

         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1","root","");
         Statement statement = connection.createStatement();
         String query = "CREATE TABLE `PEOPLE` (\n" +
                 "`id` INT NOT NULL,\n" +
                 "`name` VARCHAR(45) NULL,\n" +
                 "`address` VARCHAR(45) NULL,\n" +
                 "PRIMARY KEY (`id`)\n" +
                 ")";

         int rs = statement.executeUpdate(query);


    }
}
