package com.prueba.autos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prueba.autos.beans.Autos;
import com.prueba.autos.beans.RegistroAutos;

@Controller
public class AutosController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/autos/allautos")
	@ResponseBody
	public List<Autos> getAllAutos(){
		return RegistroAutos.getInstance().getregistrodelauto();
	}
}
