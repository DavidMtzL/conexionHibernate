package mx.com.dmart.hibernate;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.dmart.hibernate.model.Empleado;
import mx.com.dmart.hibernate.service.EmpleadoService;


/**
 * 
 *  @author Ing. Ronald Angulo
 * 
 */
@Component
public class CrudEmpleado {

	final static Logger logger = Logger.getLogger(CrudEmpleado.class);

	@Autowired
	private EmpleadoService empService;
	
	public void procesarCrud()
	{
		logger.info("Nuevo Empleado:");
		Empleado empleado = new Empleado();
		empleado.setApellidos("Verastegui");
		empleado.setNombres("Sonia");
		empleado.setCargo("Moza");
		empleado.setSalario(1500);
		
		if (empService.guardar(empleado)) {
			logger.info("Empleado guardado con exito.");
			}else{
			logger.info("No se pudo guardar el empleado.");
		}
		
		Empleado empById = empService.buscarPorId(2);
		logger.info("Empleado: " + empById);
		
		empById.setSalario(3000);
		if (empService.actualizar(empById)) {
			logger.info("Actualizado correctamente.");
		}else{
			logger.info("No se pudo actualizar.");
		}
		
		
		Empleado empEliminar = empService.buscarPorId(3);
		logger.info("Empleado a eliminar: " + empEliminar);
		
//		if (empService.eliminar(empEliminar)) {
//			logger.info("Eliminado correctamente.");
//		}else{
//			logger.info("No se pudo eliminar.");
//		}
		
		List<Empleado> lstEmpleado = empService.listar();
		logger.info("Empleados: " + lstEmpleado.size());
		for (Empleado emp : lstEmpleado) {
			logger.info(emp.toString());
		}
		
		
		
		

	}

}
