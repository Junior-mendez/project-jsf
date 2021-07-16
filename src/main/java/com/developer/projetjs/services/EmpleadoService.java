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
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Junior");
		empleadoIBM.setPrimerApellido("Mendez");
		empleadoIBM.setSegundoApellido("Lezcano");
		empleadoIBM.setPuesto("Asistente");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Mario");
		empleadoMicrosoft.setPrimerApellido("Mendez");
		empleadoMicrosoft.setSegundoApellido("Lezcano");
		empleadoMicrosoft.setPuesto("Analista");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Enrique");
		empleadoApple.setPrimerApellido("Mendez");
		empleadoApple.setSegundoApellido("Lezcano");
		empleadoApple.setPuesto("Lider");
		empleadoApple.setEstatus(true);
		
		empleadoAmazon.setNombre("Amazon");
		empleadoAmazon.setPrimerApellido("Mendez");
		empleadoAmazon.setSegundoApellido("Lezcano");
		empleadoAmazon.setPuesto("Jefe");
		empleadoAmazon.setEstatus(true);
		
		empleadoDeloitte.setNombre("Deloitte");
		empleadoDeloitte.setPrimerApellido("Mendez");
		empleadoDeloitte.setSegundoApellido("Lezcano");
		empleadoDeloitte.setPuesto("Encargado");
		empleadoDeloitte.setEstatus(true);
		
		empleadoDisney.setNombre("Disney");
		empleadoDisney.setPrimerApellido("Mendez");
		empleadoDisney.setSegundoApellido("Lezcano");
		empleadoDisney.setPuesto("Subjefe");
		empleadoDisney.setEstatus(true);
		
		empleadoHP.setNombre("HP");
		empleadoHP.setPrimerApellido("Mendez");
		empleadoHP.setSegundoApellido("Lezcano");
		empleadoHP.setPuesto("Arquitecto");
		empleadoHP.setEstatus(true);
		
		empleadoNetflix.setNombre("Netflix");
		empleadoNetflix.setPrimerApellido("Manrique");
		empleadoNetflix.setSegundoApellido("Lezcano");
		empleadoNetflix.setPuesto("Gerente");
		empleadoNetflix.setEstatus(true);
		
		empleadoOracle.setNombre("Oracle");
		empleadoOracle.setPrimerApellido("Mendoza");
		empleadoOracle.setSegundoApellido("Lezcano");
		empleadoOracle.setPuesto("Auxiliar");
		empleadoOracle.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		empleados.add(empleadoHP);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		
		return empleados;
	}

}
