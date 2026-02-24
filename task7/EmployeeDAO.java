import java.sql.*;

public class EmployeeDAO {

    // ➕ Add Employee
    public static void addEmployee(String name, String department, double salary) {

        String query = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, department);
            ps.setDouble(3, salary);

            ps.executeUpdate();
            System.out.println("Employee added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 📄 View Employees
    public static void viewEmployees() {

        String query = "SELECT * FROM employees";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✏ Update Employee
    public static void updateEmployee(int id, double salary) {

        String query = "UPDATE employees SET salary=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee updated successfully!");
            else
                System.out.println("Employee not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ❌ Delete Employee
    public static void deleteEmployee(int id) {

        String query = "DELETE FROM employees WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee deleted successfully!");
            else
                System.out.println("Employee not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}