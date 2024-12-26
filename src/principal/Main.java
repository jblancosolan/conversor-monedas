package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import arreglo.ArregloMonedas;
import data.Moneda;
 import data.TesteoMoneda;
import fechas.FechaGenerada;
import intermadia.ClaseIntermedia;
import registrar.EscribirCambio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			int opcion=0 ; 
			
		   	List<ClaseIntermedia> lista = new ArrayList<ClaseIntermedia>();
		  //	List<String> lista = new ArrayList<String>();

			do
			{
				try {
					menu();
					System.out.println("ingresa tu opcion(entre el 1 y el 9) :");
  				    opcion = Integer.parseInt(teclado.next());
  					System.out.println("escribe la ruta donde se guardara tu registro : ");
				  		String ruta = teclado.next() ;
				  		ruta = ruta+".txt";
 					  
 					  switch(opcion)
 					  {
 					  	case 1:	case 2:case 3:case 4:case 5:case 6:case 7:case 8:
 					  		System.out.println("dame tu cantidad");
 					  		int cantidad  = teclado.nextInt();
 					  		Moneda moneda = new Moneda().devolverMonedaxOpcion(opcion) ; 
 					  		
 					  		/// aca se genera la hora y la fecha 
 					  		FechaGenerada fecha  = new FechaGenerada() ;
 					  		System.out.println(fecha);
 					  		
 					  		ClaseIntermedia clase = new ClaseIntermedia(moneda, fecha);
 					  		lista.add(clase);

 					  		/// convirtiendo en json
 					  	//	String json  = new Gson().toJson(clase );
 					  	//	lista.add(json);
 					  	
 					  		EscribirCambio escribir = new EscribirCambio();
 					  		escribir.registrarTransaccion(lista, ruta);

 					  		System.out.println(lista);
 	
 			 				System.out.println("el valor " +cantidad   + "["+moneda.getBase_code() + "]"
 					  		  + " corresponde al valor final de ==> " +moneda.convertirDeDolarAMoneda(cantidad, opcion) + " [" +moneda.getTarget_code()+"]");
 					  		 System.out.println("--------------------------------------------------------------------------------");
 					  		 break;
 	
 					  }
 					
					
				} catch (NumberFormatException e) {
					// TODO: handle exception 
					System.out.println("valor solo numerico :  " + e.getMessage());
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println("error   : " + e.getMessage());
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("error  general  : " + e.getMessage());

				}

			}while(opcion!=9);
			
			System.out.println("saliste del sistema");
	}
	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Sea bienvenido(a) al conversor de monedas :\n");
		System.out.printf("%1s%15s%20s","1.-)\tDolar","==>","Peso Argentino\n");
 	//	System.out.println("1.-)\tDolar ======>\t Peso Argentino");
		System.out.printf("%1s%6s%11s","2.-)\tPeso Argentino","==>","Dólar\n");
	//	System.out.println("2.-)\tPeso Argentino ======>\t Dólar");
		System.out.printf("%1s%15s%20s","3.-)\tDólar","==>","Real Brasileño\n");
		///System.out.println("3.-)\tDólar ==> Real Brasileño");
		System.out.printf("%1s%6s%11s","4.-)\tReal Brasileño","==>","Dolar\n");
		System.out.printf("%1s%15s%21s","5.-)\tDólar","==>","Peso Colombiano\n");
		System.out.printf("%1s%5s%11s","6.-)\tPeso Colombiano","==>","Dólar\n");
	//	System.out.println("6.-)\tPeso Colombiano ==> Dólar");
		System.out.printf("%1s%15s%11s","7.-)\tDolar","==>","Soles\n");
 	//	System.out.println("7.-)\tDolar ======>\t Soles");
		System.out.printf("%1s%15s%13s","8.-)\tSoles","==>","Dolares\n");
 		//System.out.println("8.-)\tSoles ======>\t Dolares");
		System.out.println("9.-)\t***************Salir**********************");
		System.out.println("**********Eliga una opción válida************");
		System.out.println("\n");
 
	}

}
