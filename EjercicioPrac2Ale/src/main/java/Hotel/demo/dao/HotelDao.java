/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.dao;


import Hotel.demo.domain.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class HotelDao {
    private Connection connection;
 
    public HotelDao(Connection connection) {
        this.connection = connection;
    }
 
    public void save(Hotel hotel) throws SQLException {
        String sql = "INSERT INTO hoteles (nombre, ubicacion, descripcion) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, hotel.getNombre());
            stmt.setString(2, hotel.getUbicacion());
            stmt.setString(3, hotel.getDescripcion());
            stmt.executeUpdate();
        }
    }
 
    public Hotel findById(int id) throws SQLException {
        String sql = "SELECT * FROM hoteles WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Hotel(rs.getInt("id"), rs.getString("nombre"), rs.getString("ubicacion"), rs.getString("descripcion"));
            }
        }
        return null;
    }
}