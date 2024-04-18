/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.dao;

import Hotel.demo.domain.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class EmpleadoDao {
    private Connection connection;
 
    public EmpleadoDao(Connection connection) {
        this.connection = connection;
    }
 
    public void save(Empleado empleado) throws SQLException {
        String sql = "INSERT INTO empleados (nombre, cargo, hotel_id) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getCargo());
            stmt.setInt(3, empleado.getHotelId());
            stmt.executeUpdate();
        }
    }
 
    public Empleado findById(int id) throws SQLException {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("cargo"), rs.getInt("hotel_id"));
            }
        }
        return null;
    }
}