/**
 * 
 */
package es.curso.model;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public class Local extends Llamada {

	public Local(int numeroOrigen, int numeroSalida, int duracion) {
		super(numeroOrigen, numeroSalida, duracion);

	}

	private final int precio = 15;

	@Override
	public int llamar() {

		return getDuracion() * precio;
	}

	@Override
	public String toString() {
		return "Local [precio=" + precio + ", Número de origen " + getNumeroOrigen() + ", Número de salida "
				+ getNumeroSalida() + "]";
	}

}
