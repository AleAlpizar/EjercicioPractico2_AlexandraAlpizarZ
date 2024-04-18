/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.service;

/**
 *
 * @author 11alp
 */
import Hotel.demo.domain.Reserva;
 
public interface ReservaService {
    void createReserva(Reserva reserva);
    Reserva getReservaById(int id);
}