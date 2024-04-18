/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.domain;
import java.util.Date;
 
public class Reserva {
    private int id;
    private String clienteNombre;
    private int numHuespedes;
    private Date fechaIngreso;
    private Date fechaSalida;
    private int hotelId;
    private String numeroCedula;
 
    public Reserva(int id, String clienteNombre, int numHuespedes, Date fechaIngreso, Date fechaSalida, int hotelId, String numeroCedula) {
        this.id = id;
        this.clienteNombre = clienteNombre;
        this.numHuespedes = numHuespedes;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.hotelId = hotelId;
        this.numeroCedula = numeroCedula;
    }
 
    // Getters
    public int getId() {
        return id;
    }
 
    public String getClienteNombre() {
        return clienteNombre;
    }
 
    public int getNumHuespedes() {
        return numHuespedes;
    }
 
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
 
    public Date getFechaSalida() {
        return fechaSalida;
    }
 
    public int getHotelId() {
        return hotelId;
    }
 
    public String getNumeroCedula() {
        return numeroCedula;
    }
 
    // Setters
    public void setId(int id) {
        this.id = id;
    }
 
    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }
 
    public void setNumHuespedes(int numHuespedes) {
        this.numHuespedes = numHuespedes;
    }
 
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
 
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
 
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
 
    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
}