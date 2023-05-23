package es.curso.model;

import es.curso.model.Provincial.Franjas;

/**
 * 
 * @author Alberto Zapardiel Fernández
 *
 */
public class Centralita {

	private static int conteoLlamadas, costeLlamada;

	/**
	 * Método para contar llamadas Para un trabajo más profesional se puede hacer un
	 * ArrayList de llamadas y en cada llamada ir agregándola
	 */
	public void contarLlamadas() {
		addLlamada(new Local(123, 321, 15));
		addLlamada(new Provincial(123, 321, 15, Franjas.UNO));
		addLlamada(new Provincial(123, 321, 50, Franjas.TRES));
		addLlamada(new Provincial(123, 321, 20, Franjas.DOS));
		System.out.println("Total de llamadas " + conteoLlamadas);
		System.out.println("Precio llamadas " + costeLlamada);
	}

	/**
	 * 
	 * @param llamada  pasada para agregar
	 * @param segundos que se han utilizado en la llamada
	 */
	private void addLlamada(Llamada llamada) {
		conteoLlamadas++;
		costeLlamada += llamada.llamar();
	}
}
