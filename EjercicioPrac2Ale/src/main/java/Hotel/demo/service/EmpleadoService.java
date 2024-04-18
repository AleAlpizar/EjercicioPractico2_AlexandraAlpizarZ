/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.demo.service;
import Hotel.demo.domain.Empleado;
/**
 *
 * @author 11alp
 */
public interface EmpleadoService {
    void createEmpleado(Empleado empleado);
    Empleado getEmpleadoById(int id);
}
