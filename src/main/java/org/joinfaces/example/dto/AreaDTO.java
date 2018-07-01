package org.joinfaces.example.dto;

import lombok.Data;

@Data
public class AreaDTO implements java.io.Serializable {

	private Integer idArea;
	private String nombreArea;

	public AreaDTO() {
	}

	public AreaDTO(Integer idArea, String nombreArea) {
		this.idArea = idArea;
		this.nombreArea = nombreArea;
	}

	public Integer getIdArea() {
		return this.idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return this.nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

}