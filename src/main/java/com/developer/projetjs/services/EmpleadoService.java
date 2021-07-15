/**
 * 
 */
package com.developer.projetjs.services;

import java.util.ArrayList;
import java.util.List;

import com.developer.projetjs.entity.Empleado;

/**
 * @author Junior Mendez
 * Clase que permite realizar la clase de negocio para empleado.
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Junior");
		empleadoIBM.setPrimerApellido("Mendez");
		empleadoIBM.setSegundoApellido("Lezcano");
		empleadoIBM.setPuesto("Asistente");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Juan");
		empleadoMicrosoft.setPrimerApellido("Mendez");
		empleadoMicrosoft.setSegundoApellido("Lezcano");
		empleadoMicrosoft.setPuesto("Asistente");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Enrique");
		empleadoApple.setPrimerApellido("Mendez");
		empleadoApple.setSegundoApellido("Lezcano");
		empleadoApple.setPuesto("Asistente");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
