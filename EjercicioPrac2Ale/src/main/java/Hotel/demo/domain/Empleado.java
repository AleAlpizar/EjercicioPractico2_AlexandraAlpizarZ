/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.domain;

/**
 *
 * @author 11alp
 */
public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private int hotelId; 
 
    public Empleado(int id, String nombre, String cargo, int hotelId) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.hotelId = hotelId;
    }
 
    // Getters
    public int getId() {
        return id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getCargo() {
        return cargo;
    }
 
    public int getHotelId() {
        return hotelId;
    }
 
    // Setters
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
}
