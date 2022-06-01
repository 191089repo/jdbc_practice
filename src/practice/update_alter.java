package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update_alter {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1","root","");
        Statement statement = connection.createStatement();

        Scanner sc =  new Scanner(System.in);

            System.out.println("Enter record id to be updated: ");
           int id = sc.nextInt();
            System.out.println("Enter new name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter new address: ");
            String address = sc.nextLine();

            String query ="\"UPDATE PERSON SET NAME = 'Rohma', ADDRESS = 'xyz'\"\n" +
                    "+ \"WHERE ID = '42101'";//query error
        int rs = statement.executeUpdate(query);
    }

}
