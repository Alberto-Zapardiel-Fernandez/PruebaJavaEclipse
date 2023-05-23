package es.curso.model;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public abstract class Llamada {

	private int numeroOrigen, numeroSalida, duracion;

	public abstract int llamar();

	/**
	 * @param numeroOrigen
	 * @param numeroSalida
	 * @param duracion
	 */
	public Llamada(int numeroOrigen, int numeroSalida, int duracion) {
		this.numeroOrigen = numeroOrigen;
		this.numeroSalida = numeroSalida;
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @return the numeroOrigen
	 */
	public int getNumeroOrigen() {
		return numeroOrigen;
	}

	/**
	 * @return the numeroSalida
	 */
	public int getNumeroSalida() {
		return numeroSalida;
	}

}
