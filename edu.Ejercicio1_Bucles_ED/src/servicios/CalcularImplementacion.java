/***
 * Ruben Bernal Ramos
 * CSI1
 */

package servicios;
 
/***
  * Implementación de la interfaz Calcular
  * rbr - 201123
  */
public class CalcularImplementacion implements CalcularInterfaz{

	/***
	 * Método que calculará los pagos mensuales
	 * rbr - 201123 
	 */
	public void calcularPagos(int meses) {
		
		int cuota = 5, total = 0;
		for(int i=1; i<=meses; i++) {
			cuota = cuota * 2;
			total = total + cuota;
			System.out.println("El mes " + i + " deberá pagar: " + cuota + " euros.");
		}
		System.out.println("El precio total del artículo es: " + total);
	}

}
