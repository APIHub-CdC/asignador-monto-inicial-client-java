package io.amfis.client.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ScoreRequest extends Errores  implements Serializable {
	
	@SerializedName("cadenaVariables")
	private String cadenaVariables;

}