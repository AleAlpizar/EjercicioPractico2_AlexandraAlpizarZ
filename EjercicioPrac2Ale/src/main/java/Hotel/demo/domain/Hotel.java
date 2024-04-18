/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="hoteles")
public class Hotel implements Serializable {
    private int id;
    private String nombre;
    private String ubicacion;
    private String descripcion;
 
    public Hotel(int id, String nombre, String ubicacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }
 
    // Getters
    public int getId() {
        return id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getUbicacion() {
        return ubicacion;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    // Setters
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
