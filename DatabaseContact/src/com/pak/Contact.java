package com.pak;
 
import java.sql.*;
public class Contact {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/contactsdb?useSSL=false";
	        String username = "root";
	        String password = "root";
	        String sql = "INSERT INTO contacts (firstname, lastname, city, country) VALUES (?, ?, ?, ?)";
	 
	        try {
	 
	            Connection connection = DriverManager.getConnection(url, username, password);
	            PreparedStatement statement = connection.prepareStatement(sql);
	 
	            statement.setString(1, "Tom");
	            statement.setString(2, "Eagar");
	            statement.setString(3, "Chicago");
	            statement.setString(4, "U.S.A");
	 
	            int rows = statement.executeUpdate();
	 
	            if (rows > 0) {
	                System.out.println("A row was inserted.");
	            } else {
	                System.out.println("No row was inserted.");
	            }
	 
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	 
	    }
	}
//ant
// ant clean
//java -jar dist\ContactManager-20231231.jar

//ant compile dist run