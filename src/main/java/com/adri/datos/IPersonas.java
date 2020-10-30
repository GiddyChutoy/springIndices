package com.adri.datos;

import java.io.IOException;

public interface IPersonas {

	void cogerDatos(String nombre) throws IOException;

	/**
	 * @return the nombre
	 */
	String getNombre();

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre);

	/**
	 * @return the peso
	 */
	double getPeso();

	/**
	 * @param peso the peso to set
	 */
	void setPeso(int peso);

	/**
	 * @return the altura
	 */
	double getAltura();

	/**
	 * @param altura the altura to set
	 */
	void setAltura(int altura);

	String toString();

}