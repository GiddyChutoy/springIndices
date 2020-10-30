/**
 * 
 */
package com.adri.controlador;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.negocio.ICalculo;

/**
 * @author 201907
 *
 */
@Controller
public class Controlador {
	
	@Autowired
	ICalculo calculo;
	
	@RequestMapping("bananas")
	public String indiceMasa(@RequestParam("nombre") String nombre, ModelMap model) {
		
		int masaCorporal;
		try {
			masaCorporal = (int) calculo.calcularIndice(nombre);
			model.addAttribute("MasaCorporal", masaCorporal);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "MasaCorporal";
	}
	
}
