/**
 * 
 */
package es.curso.model;

/**
 * @author sinensia
 *
 */
public class Provincial extends Llamada {

	private Franjas precioFranja;
	private int precioTotalLlamada;

	public Provincial(int numeroOrigen, int numeroSalida, int duracion, Franjas franja) {
		super(numeroOrigen, numeroSalida, duracion);
		this.precioFranja = comprobarFranja(franja);
	}

	private Franjas comprobarFranja(Franjas franja) {

		Franjas f = Franjas.TRES;

		try {
			f = Enum.valueOf(Franjas.class, String.valueOf(franja));
		} catch (IllegalArgumentException e) {
			System.err.println("No existe");
		}

		return f;
	}

	public enum Franjas {
		UNO(20), DOS(25), TRES(30);

		private int precio;

		Franjas(int precio) {
			this.precio = precio;
		}

		public int getPrecio() {
			return precio;
		}
	}

	@Override
	public int llamar() {
		precioTotalLlamada = precioFranja.getPrecio();
		precioTotalLlamada += getDuracion();
		return precioTotalLlamada;
	}

	@Override
	public String toString() {
		return "Provincial [precioFranja=" + precioFranja + ", precioTotalLlamada=" + precioTotalLlamada
				+ ", Número de origen=" + getNumeroOrigen() + ", Número de salida=" + getNumeroSalida() + "]";
	}

}
