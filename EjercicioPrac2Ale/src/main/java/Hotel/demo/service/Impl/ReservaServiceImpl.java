/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.service.Impl;

/**
 *
 * @author 11alp
 */
import Hotel.demo.dao.ReservaDao;
import Hotel.demo.domain.Reserva;
import Hotel.demo.service.ReservaService;
import java.sql.SQLException;
 
public class ReservaServiceImpl implements ReservaService {
    private ReservaDao reservaDao;
 
    public ReservaServiceImpl(ReservaDao reservaDAO) {
        this.reservaDao = reservaDAO;
    }
 
    @Override
    public void createReserva(Reserva reserva) {
        try {
            reservaDao.save(reserva);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create reservation", e);
        }
    }
 
    @Override
    public Reserva getReservaById(int id) {
        try {
            return reservaDao.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to retrieve reservation", e);
        }
    }
}