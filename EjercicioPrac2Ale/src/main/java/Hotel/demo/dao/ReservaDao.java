/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.dao;

/**
 *
 * @author 11alp
 */
import Hotel.demo.domain.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class ReservaDao {
    private Connection connection;
 
    public ReservaDao(Connection connection) {
        this.connection = connection;
    }
 
    public void save(Reserva reserva) throws SQLException {
        String sql = "INSERT INTO reservas (cliente_nombre, num_huespedes, fecha_ingreso, fecha_salida, hotel_id, numero_cedula) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, reserva.getClienteNombre());
            stmt.setInt(2, reserva.getNumHuespedes());
            stmt.setDate(3, new java.sql.Date(reserva.getFechaIngreso().getTime()));
            stmt.setDate(4, new java.sql.Date(reserva.getFechaSalida().getTime()));
            stmt.setInt(5, reserva.getHotelId());
            stmt.setString(6, reserva.getNumeroCedula());
            stmt.executeUpdate();
        }
    }
 
    public Reserva findById(int id) throws SQLException {
        String sql = "SELECT * FROM reservas WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Reserva(rs.getInt("id"), rs.getString("cliente_nombre"), rs.getInt("num_huespedes"),
                                   rs.getDate("fecha_ingreso"), rs.getDate("fecha_salida"), rs.getInt("hotel_id"), rs.getString("numero_cedula"));
            }
        }
        return null;
    }
}