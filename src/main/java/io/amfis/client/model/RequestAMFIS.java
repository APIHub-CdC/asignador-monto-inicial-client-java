package io.amfis.client.model;

import com.google.gson.annotations.SerializedName;

public class RequestAMFIS {
	
	@SerializedName("folioCliente")
	private String folioCliente;
	
	@SerializedName("folioConsulta")
	private Integer folioConsulta;

	@SerializedName("CP")
	private String CP;
	
	@SerializedName("persona")
	private PersonaRequest persona;
	
	@SerializedName("nperscve")
	private Long nperscve;
	
	@SerializedName("cvePersona")
	private Long cvePersona;

	public String getFolioCliente() {
		return this.folioCliente;
	}

	public void setFolioCliente(String folioCliente) {
		this.folioCliente = folioCliente;
	}

	public Integer getFolioConsulta() {
		return this.folioConsulta;
	}

	public void setFolioConsulta(Integer folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	public String getCP() {
		return this.CP;
	}

	public void setCP(String CP) {
		this.CP = CP;
	}

	public PersonaRequest getPersona() {
		return this.persona;
	}

	public void setPersona(PersonaRequest persona) {
		this.persona = persona;
	}

	public Long getNperscve() {
		return this.nperscve;
	}

	public void setNperscve(Long nperscve) {
		this.nperscve = nperscve;
	}

	public Long getCvePersona() {
		return this.cvePersona;
	}

	public void setCvePersona(Long cvePersona) {
		this.cvePersona = cvePersona;
	}
	
}
