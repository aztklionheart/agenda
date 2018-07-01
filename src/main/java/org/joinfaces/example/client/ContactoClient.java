package org.joinfaces.example.client;

import java.util.List;

import org.joinfaces.example.dto.PersonaEmpresaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="contacto", url="https://agenda-208107.appspot.com/")
public interface ContactoClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/contacto/query/{query}")
	List<PersonaEmpresaDTO> getContactos(@PathVariable("query")String query);

}
