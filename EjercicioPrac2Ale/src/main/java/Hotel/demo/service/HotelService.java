/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.service;

import Hotel.demo.domain.Hotel;
/**
 *
 * @author 11alp
 */
public interface HotelService {
    void createHotel(Hotel hotel);
    Hotel getHotelById(int id);
}
