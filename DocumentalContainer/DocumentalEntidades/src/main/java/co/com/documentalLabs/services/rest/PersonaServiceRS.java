package co.com.documentalLabs.services.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.com.documentalLabs.domain.Persona;
import co.com.documentalLabs.service.PersonaService;
import co.com.documentalLabs.service.exception.ServiceException;

@Controller
@RequestMapping("/private/personas2")
public class PersonaServiceRS {
    
	public PersonaServiceRS(){
		System.out.println("lolaso");
	}
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Persona> readBookmarks() {
		try {
			return this.personaService.listar();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
