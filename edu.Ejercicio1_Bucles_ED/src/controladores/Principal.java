/***
 * Ruben Bernal Ramos
 * CSI1
 */

package controladores;

import servicios.SolicitarInterfaz;
import servicios.SolicitarImplementacion;
import servicios.CalcularInterfaz;
import servicios.CalcularImplementacion;

/***
 * Clase principal de la aplicación
 * rbr - 201123
 */
public class Principal {
	
	/***
	 * Método principal de la aplicación
	 * rbr - 201123
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaro la variable
		int meses;
		
		//Instancio las interfaces con sus implementaciones
		SolicitarInterfaz si = new SolicitarImplementacion();
		CalcularInterfaz ci = new CalcularImplementacion();
		
		//Solicito el número de meses
		meses = si.solicitudMeses();
		
		//Calculo las cuotas mensuales y las muestro por consola
		ci.calcularPagos(meses);

	}

}
