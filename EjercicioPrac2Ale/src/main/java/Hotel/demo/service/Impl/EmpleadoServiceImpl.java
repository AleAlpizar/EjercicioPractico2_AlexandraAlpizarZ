/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.demo.service.Impl;
import Hotel.demo.dao.EmpleadoDao;
import Hotel.demo.domain.Empleado;
import Hotel.demo.service.EmpleadoService;
import java.sql.SQLException;
/**
 *
 * @author 11alp
 */
public class EmpleadoServiceImpl implements EmpleadoService {
    private EmpleadoDao empleadoDao;
 
    public EmpleadoServiceImpl(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }
 
    @Override
    public void createEmpleado(Empleado empleado) {
        try {
            empleadoDao.save(empleado);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create employee", e);
        }
    }
 
    @Override
    public Empleado getEmpleadoById(int id) {
        try {
            return empleadoDao.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to retrieve employee", e);
        }
    }
}
