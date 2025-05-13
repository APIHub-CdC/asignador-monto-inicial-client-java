package io.amfis.client.model;

import com.google.gson.annotations.SerializedName;


public class DomicilioRequest {
	
	@SerializedName("direccion")
	private String direccion; 

	@SerializedName("coloniaPoblacion")
	private String coloniaPoblacion; 

	@SerializedName("delegacionMunicipio")
	private String delegacionMunicipio; 

	@SerializedName("ciudad")
	private String ciudad; 

	@SerializedName("pais")
	private String pais; 
	
	@SerializedName("estado")
	private String estado;
	
	@SerializedName("CP")
	private String CP; 

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getColoniaPoblacion() {
		return this.coloniaPoblacion;
	}

	public void setColoniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
	}

	public String getDelegacionMunicipio() {
		return this.delegacionMunicipio;
	}

	public void setDelegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCP() {
		return this.CP;
	}

	public void setCP(String CP) {
		this.CP = CP;
	}
	
}
