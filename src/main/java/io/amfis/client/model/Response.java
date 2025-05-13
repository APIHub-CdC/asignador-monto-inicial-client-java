package io.amfis.client.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Response extends Errores  implements Serializable  {
	
	@SerializedName("code")
	private Long code;
	
	@SerializedName("message")
	private String message; 

	@SerializedName("appName")
	private String appName;
	
	@SerializedName("auth")
	private String auth;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	
}
