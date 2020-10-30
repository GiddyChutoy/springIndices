/**
 * 
 */
package com.adri.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

/**
 * @author Giddy
 *
 */
@Component
public class Personas implements IPersonas {
	private String nombre;
	private double peso;
	private double altura;
	
	@Override
	public void cogerDatos(String nombre) throws IOException {
		File fichero = new File("personas.txt");
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		while((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			if(array[0].equalsIgnoreCase(nombre)) {
				this.nombre = array[0];
				peso = Double.parseDouble(array[1]);
				altura = Double.parseDouble(array[2]);
				break;
			}
		}
	}

	/**
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peso
	 */
	@Override
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	@Override
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	@Override
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	@Override
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
