/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.controller;
import Hotel.demo.domain.Empleado;
import Hotel.demo.service.EmpleadoService;
/**
 *
 * @author 11alp
 */
public class EmpleadoController {
    private EmpleadoService empleadoService;
 
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
 
    public void addEmpleado(String nombre, String cargo, int hotelId) {
        Empleado empleado = new Empleado(0, nombre, cargo, hotelId); // Assuming 0 will be replaced by auto-generated ID
        empleadoService.createEmpleado(empleado);
    }
 
    public Empleado findEmpleadoById(int id) {
        return empleadoService.getEmpleadoById(id);
    }
}
