package io.amfis.client.model;

import com.google.gson.annotations.SerializedName;

public class PersonaRequest {
	
	@SerializedName("nombres")
	private String nombres;

	@SerializedName("apellidoPaterno")
	private String apellidoPaterno;

	@SerializedName("apellidoMaterno")
	private String apellidoMaterno;

	@SerializedName("apellidoAdicional")
	private String apellidoAdicional;

	@SerializedName("fechaNacimiento")
	private String fechaNacimiento;

	@SerializedName("RFC")
	private String rfc;

	@SerializedName("domicilio")
	private DomicilioRequest domicilio;

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoAdicional() {
		return this.apellidoAdicional;
	}

	public void setApellidoAdicional(String apellidoAdicional) {
		this.apellidoAdicional = apellidoAdicional;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public DomicilioRequest getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(DomicilioRequest domicilio) {
		this.domicilio = domicilio;
	}

	
}
