package mx.com.dmart.hibernate.service;

import java.util.List;

import mx.com.dmart.hibernate.model.Empleado;


public interface EmpleadoService {
		
	public boolean guardar(Empleado empleado);

	public Empleado buscarPorId(int id);

	public boolean actualizar(Empleado empleado);

	public List<Empleado> listar();

	public boolean eliminar(Empleado empleado);
}
