/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.controller;
import Hotel.demo.domain.Hotel;
import Hotel.demo.service.HotelService;
/**
 *
 * @author 11alp
 */
public class HotelController {
    private HotelService hotelService;
 
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }
 
    public void addHotel(String nombre, String ubicacion, String descripcion) {
        Hotel hotel = new Hotel(0, nombre, ubicacion, descripcion); 
        hotelService.createHotel(hotel);
    }
 
    public Hotel findHotelById(int id) {
        return hotelService.getHotelById(id);
    }
}
