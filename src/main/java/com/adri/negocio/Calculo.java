/**
 * 
 */
package com.adri.negocio;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adri.datos.IPersonas;

/**
 * @author Giddy
 *
 */
@Component
public class Calculo implements ICalculo {
	
	@Autowired
	IPersonas p1;
	
	//IPersonas p1 = new Personas();
	
	
	@Override
	public double calcularIndice(String nombre) {
		try {
			p1.cogerDatos(nombre);
		} catch (IOException e) {
			e.printStackTrace();
		}
		double resultado = (p1.getPeso()/((p1.getAltura())/100));
		return resultado;
	}
}
