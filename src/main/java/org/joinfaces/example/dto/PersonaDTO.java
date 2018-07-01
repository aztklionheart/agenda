package org.joinfaces.example.dto;

import lombok.Data;

@Data
public class PersonaDTO {

	private Integer idPersona;
	private TipoPersonaDTO tipoPersonaDTO;
	private String nombre;
	private String primerAp;
	private String segundoAp;
	private String direccion;
	private String telefono;


	public PersonaDTO() {
	}

	public PersonaDTO(Integer idPersona, TipoPersonaDTO tipoPersonaDTO, String nombre, String primerAp, String segundoAp,
                      String telefono) {
		this.idPersona = idPersona;
		this.tipoPersonaDTO = tipoPersonaDTO;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.telefono = telefono;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public TipoPersonaDTO getCatTipoPersona() {
		return this.tipoPersonaDTO;
	}

	public void setCatTipoPersona(TipoPersonaDTO tipoPersonaDTO) {
		this.tipoPersonaDTO = tipoPersonaDTO;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerAp() {
		return this.primerAp;
	}

	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;
	}

	public String getSegundoAp() {
		return this.segundoAp;
	}

	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}