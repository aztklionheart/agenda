package org.joinfaces.example.dto;

import lombok.Data;

@Data
public class PersonaEmpresaDTO {

	private PersonaEmpresaIdDTO id;
	private AreaDTO areaDTO;
	private EmpresaDTO empresaDTO;
	private PersonaDTO personaDTO;

	public PersonaEmpresaDTO() {
	}

	public PersonaEmpresaDTO(PersonaEmpresaIdDTO id, AreaDTO catEmpresa, PersonaDTO personaDTO) {
		this.setId(id);
		this.setEmpresaDTO(getEmpresaDTO());
		this.setPersonaDTO(personaDTO);
	}


	public PersonaEmpresaIdDTO getId() {
		return id;
	}

	public void setId(PersonaEmpresaIdDTO id) {
		this.id = id;
	}

	public AreaDTO getAreaDTO() {
		return areaDTO;
	}

	public void setAreaDTO(AreaDTO areaDTO) {
		this.areaDTO = areaDTO;
	}

	public EmpresaDTO getEmpresaDTO() {
		return empresaDTO;
	}

	public void setEmpresaDTO(EmpresaDTO empresaDTO) {
		this.empresaDTO = empresaDTO;
	}

	public PersonaDTO getPersonaDTO() {
		return personaDTO;
	}

	public void setPersonaDTO(PersonaDTO personaDTO) {
		this.personaDTO = personaDTO;
	}
}