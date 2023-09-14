package com.example.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/customer";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Jaswanth-123";

    public void saveCustomer(Customer customer) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO customer (name, email, address) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getAddress());
            statement.executeUpdate();
            System.out.println("Customer saved successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
