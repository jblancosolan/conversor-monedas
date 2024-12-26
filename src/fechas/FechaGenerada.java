package fechas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FechaGenerada {

	public FechaGenerada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String obtenerFechaConsulta()
	{	
		LocalDate localDate = LocalDate.now() ; 
		String pattern = "dd-MM-yyyy";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String formato = localDate.format(dtf);
 		return formato ; 
	}
	
	public String obtenerHoraConsulta()
	{
		LocalTime ahora = LocalTime.now() ; 
		String patron  = "HH:mm:ss";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patron);
		String formato = ahora.format(dtf);
 		return formato ; 
	}
	
	public String toString()
	{
		return "consulta realizada el : " + obtenerFechaConsulta() + " a las  :" +obtenerHoraConsulta() +"\n";
	}
	
	
	 
	
	
}
