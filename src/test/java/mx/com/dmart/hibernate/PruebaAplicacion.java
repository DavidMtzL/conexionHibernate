package mx.com.dmart.hibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mx.com.dmart.hibernate.config.AplicacionConf;


/**
 * 
 *  @author Ing. Ronald Angulo
 * 
 */
public class PruebaAplicacion {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(AplicacionConf.class);
			CrudEmpleado application = context.getBean(CrudEmpleado.class);

			application.procesarCrud();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}	    
	}
}