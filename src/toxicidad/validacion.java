package toxicidad;

public class validacion {
	
	public String gradoToxicidad(double stgNivel) {
		
		String grado = "";
		
		if ((stgNivel >= 0.0)&&(stgNivel <= 3.8 )) {
			grado = "Verde";
		}else if ((stgNivel >= 3.81)&&(stgNivel <= 8.25 )) {
			grado = "Azul";
		}else if((stgNivel >= 8.26)&&(stgNivel <= 15.0 )) {
			grado = "Amarillo";
		}else if(stgNivel > 15.0) {
			grado = "Rojo";
		}
		
		return grado;
		
	}
	
}
