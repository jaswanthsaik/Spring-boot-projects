//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//
//import com.example.customer.Customer;
//
//@SpringBootApplication
//@ComponentScan(basePackages = "com.example")
//public class Main {
//    public static void main(String[] args) {
//        // Create a Customer object
//        Customer customer = new Customer();
//        customer.setName("John Doe");
//        customer.setEmail("johndoe@example.com");
//        customer.setAddress("123 Main St, City");
//
//        // Create a connection to the database
//        String url = "jdbc:mysql://localhost:3306/customer";
//        String username = "root";
//        String password = "Jaswanth-123";
//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            // Create a prepared statement to insert the customer data
//            String sql = "INSERT INTO customer (name, email, address) VALUES (?, ?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, customer.getName());
//            statement.setString(2, customer.getEmail());
//            statement.setString(3, customer.getAddress());
//
//            // Execute the query to save the customer data
//            int rowsAffected = statement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Customer data saved successfully.");
//            } else {
//                System.out.println("Failed to save customer data.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}