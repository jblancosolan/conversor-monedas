package data;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class TesteoMoneda {
	
		public Moneda tipoCambio(String base, String target) throws IOException, InterruptedException
		{
			Moneda moneda  =null;
			String url = "https://v6.exchangerate-api.com/v6/4d660cf080ac9b0f65185c47/pair/";
			String direccion = url +base +"/"+target ;
			

			 HttpClient client = HttpClient.newHttpClient();
			   HttpRequest request = HttpRequest.newBuilder()
			         .uri(URI.create(direccion))
			         .build();
			   HttpResponse<String> response = client
					     .send(request, BodyHandlers.ofString()); 
			   
			   String json = response.body() ; 
			  /// System.out.println(response.body());
			   
			   Gson gson  = new Gson();
			   moneda = gson.fromJson(json, Moneda.class);
			
	
			
			return moneda ; 
			
			
		}
	 
		/*
		public static void main(String args []) throws IOException, InterruptedException{
		 
			TesteoMoneda testeo = new TesteoMoneda();
			Moneda moneda 			=testeo.tipoCambio("USD", "COP");
			System.out.println(moneda);

}
	*/	
		
}
