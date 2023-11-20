/***
 * Ruben Bernal Ramos
 * CSI1
 */

package servicios;

import java.util.Scanner;

/***
 * Implementación de la interfaz solicitar
 * rbr 201123
 */
public class SolicitarImplementacion implements SolicitarInterfaz {

	/***
	 * Método que solicitará el número de meses a pagar el artículo
	 * rbr - 201123
	 */
	public int solicitudMeses() {
		int meses;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de meses en los que deseas pagar el artículo:");
		meses = sc.nextInt();
		sc.close();
		return meses;
	}
}
