package mx.com.dmart.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import mx.com.dmart.hibernate.model.Empleado;


public interface EmployeeDao {

	public Serializable guardar(Empleado empleado);

	public Empleado buscarPorId(int id);

	public boolean actualizar(Empleado empleado);

	public List<Empleado> listar();

	public boolean eliminar(Empleado empleado);

}
