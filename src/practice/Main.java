package practice;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// write your code here
        // see note at bottom
         Class.forName("com.mysql.cj.jdbc.Driver");
        // variables for connection
        final String url = "jdbc:mysql://localhost:3306/practice1";
        final String user = "root";
        final String password = "";
        // establish the connection
        Connection con = DriverManager.getConnection(url, user,password);
        // display status message
        if (con == null) {
            System.out.println("JDBC connection is not established");
            return;


        } else {
            System.out.println("Congratulations, JDBC connection is established successfully.\n");
        }
        //Remember to close the JDBC connection
        con.close();


    }
}

