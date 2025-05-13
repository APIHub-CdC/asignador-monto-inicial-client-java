package io.ami.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

import okhttp3.OkHttpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.ami.client.ApiClient;
import io.ami.client.ApiException;
import io.ami.client.model.DomicilioRequest;
import io.ami.client.model.PersonaRequest;
import io.ami.client.model.RequestAMI;
import io.ami.client.model.Response;
import io.ami.client.model.ScoreResponse;
import io.ami.interceptor.SignerInterceptor;


public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final AMIApi api = new AMIApi();
	private String xApiKey = "your_api_key";
	private String username = "your_username";
	private String password = "your_password";
	
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("https://services.circulodecredito.com.mx/ami");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(new SignerInterceptor())
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void postAMIDatosGeneralesTest() throws ApiException {
		DomicilioRequest domicilio = new DomicilioRequest();
        domicilio.setDireccion("LAGO PEYPUS 25");
        domicilio.setColoniaPoblacion("GRANADA");
        domicilio.setDelegacionMunicipio("MIGUEL HIDALGO");
        domicilio.setCiudad("MEXICO");
        domicilio.setEstado("CDMX");
        domicilio.setCP("11520");

        PersonaRequest persona = new PersonaRequest();
        persona.setNombres("MIGUEL ANGEL");
        persona.setApellidoPaterno("OSORIO");
        persona.setApellidoMaterno("CHONG");
        persona.setFechaNacimiento("04/01/1980");
        persona.setRfc("PUCJ800106R88");
        persona.setDomicilio(domicilio);

        RequestAMI request = new RequestAMI();
        request.setFolioCliente("123456789");
        request.setPersona(persona);

        ScoreResponse response = api.postAMIDatosGenerales(this.xApiKey, this.username, this.password, request);
        logger.info(response.toString());
	}

	@Test
	public void postAMIFolioConsultaTest() throws ApiException {
		RequestAMI request = new RequestAMI();

		request.setFolioCliente("123456789");
		request.setFolioConsulta(200055948);
		request.setCP("03500");

		Response response = api.postAMIFolioConsulta(xApiKey, username, password, request);
		logger.info(response.toString());
	}

}
