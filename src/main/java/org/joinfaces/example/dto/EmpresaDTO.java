package org.joinfaces.example.dto;


import lombok.Data;

@Data
public class EmpresaDTO {

	
	private Integer idEmpresa;
	private String empresa;
	private String rubro;

	public EmpresaDTO() {
	}

	public EmpresaDTO(Integer idEmpresa, String empresa) {
		this.idEmpresa = idEmpresa;
		this.empresa = empresa;
	}

	public EmpresaDTO(Integer idEmpresa, String empresa, String rubro) {
		this.idEmpresa = idEmpresa;
		this.empresa = empresa;
		this.rubro = rubro;
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getRubro() {
		return this.rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

}
