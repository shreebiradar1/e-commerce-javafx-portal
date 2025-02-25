package common;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtil {
	
	//-----------------------------------Common--------------------------------------------------------
	public static String getRequest(String url) throws IOException, InterruptedException {
		// Rest Client -> Postman
		HttpClient client = HttpClient.newHttpClient();

		// Request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.GET().build();

		// Response

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}

	public static String postRequest(String url, String body) throws IOException, InterruptedException {
		// Rest Client -> Postman
		HttpClient client = HttpClient.newHttpClient();

		// Request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(body)).build();

		// Response

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();

	}

	public static String deleteRequest(String url) throws IOException, InterruptedException {
		// Rest Client -> Postman
		HttpClient client = HttpClient.newHttpClient();

		// Request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.DELETE().build();

		// Response

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}
	
	//------------------------------------------Special--------------------------------------------------------
	private static ObjectMapper objectMapper = new ObjectMapper();
	public static <T>T searchGetRequest(String url,Class<?> searchResponse) throws IOException, InterruptedException {
		// Rest Client -> Postman
		HttpClient client = HttpClient.newHttpClient();

		// Request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.GET().build();

		// Response

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		//Converting string to object 
		@SuppressWarnings("unchecked")
		T responseObject =(T) objectMapper.readValue(response.body(), searchResponse);
		return responseObject;
	}
}
