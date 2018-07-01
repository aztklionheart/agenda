/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.example.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import freemarker.template.TemplateException;
import lombok.Getter;
import lombok.Setter;

import org.joinfaces.example.client.ContactoClient;
import org.joinfaces.example.dto.PersonaEmpresaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Victor Santana
 */
@Named
@ViewScoped
public class StarterMBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ContactoClient contactoClient;
	
	@Getter
	@Setter
	private List<PersonaEmpresaDTO> lstPersonaEmpresaDTO;

	public List<PersonaEmpresaDTO> getContactos(String query){
		
		lstPersonaEmpresaDTO = contactoClient.getContactos("sa");
		
		return lstPersonaEmpresaDTO;
		
	}

}
