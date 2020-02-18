package toxicidad;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;

public class pruebas {

	@Test
	
	public void toxicidadNula() {
		
	 	validacion nivel = new validacion();	
	 		
			assertEquals("Verde",nivel.gradoToxicidad(0.10) ); 
			assertEquals("Verde",nivel.gradoToxicidad(1.20) ); 
			assertEquals("Verde",nivel.gradoToxicidad(2.20) ); 
			assertEquals("Verde",nivel.gradoToxicidad(3.20) ); 
			assertEquals("Verde",nivel.gradoToxicidad(3.80) ); 
	}
	
	@Test
	
	public void toxicidadBaja() {
		
 		validacion nivel = new validacion();	
 		
		 	assertEquals("Azul",nivel.gradoToxicidad(3.81) ); 
		 	assertEquals("Azul",nivel.gradoToxicidad(4.82) ); 
		 	assertEquals("Azul",nivel.gradoToxicidad(5.82) ); 
		 	assertEquals("Azul",nivel.gradoToxicidad(6.82) ); 
		 	assertEquals("Azul",nivel.gradoToxicidad(7.83) ); 
		 	assertEquals("Azul",nivel.gradoToxicidad(8.25) ); 
			 	
	}
	
	@Test
	
	public void toxicidadMedia() {
		
 		validacion nivel = new validacion();	
 		
		 	assertEquals("Amarillo",nivel.gradoToxicidad(8.26) ); 
		 	assertEquals("Amarillo",nivel.gradoToxicidad(9.2) ); 
		 	assertEquals("Amarillo",nivel.gradoToxicidad(10.2) ); 
		 	assertEquals("Amarillo",nivel.gradoToxicidad(11.2) ); 
		 	assertEquals("Amarillo",nivel.gradoToxicidad(12.8) ); 
		 	assertEquals("Amarillo",nivel.gradoToxicidad(13.8) );
		 	assertEquals("Amarillo",nivel.gradoToxicidad(14.8) );
		 	assertEquals("Amarillo",nivel.gradoToxicidad(15.0) );
	}
	
	@Test
	
	public void toxicidadAlta() {
		
 		validacion nivel = new validacion();	
 		
		 	assertEquals("Rojo",nivel.gradoToxicidad(15.1) ); 
			assertEquals("Rojo",nivel.gradoToxicidad(16.2) ); 
			assertEquals("Rojo",nivel.gradoToxicidad(17.2) ); 
			assertEquals("Rojo",nivel.gradoToxicidad(18.2) ); 
			assertEquals("Rojo",nivel.gradoToxicidad(99.2) ); 

	}
}
