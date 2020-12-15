package com.prueba.autos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prueba.autos.beans.*;

@Controller
public class RegistroController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/registro/auto")
	@ResponseBody
	public RespuestaRegistro registroauto(@RequestBody Autos auto) { System.out.println("En registro auto");
		RespuestaRegistro rspreg = new RespuestaRegistro();
		RegistroAutos.getInstance().add(auto);
		
		rspreg.setName(auto.getName());
		rspreg.setColor(auto.getColor());
		rspreg.setSerial(auto.getSerial());
		rspreg.setEstado("Exitoso");
		
		return rspreg;
	}

}
