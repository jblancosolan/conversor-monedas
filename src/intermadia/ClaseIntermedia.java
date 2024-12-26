package intermadia;

import data.Moneda;
import fechas.FechaGenerada;

public class ClaseIntermedia {

	private Moneda moneda ; 
	private FechaGenerada fecha ;

	public ClaseIntermedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClaseIntermedia(Moneda moneda, FechaGenerada fecha) {
		super();
		this.moneda = moneda;
		this.fecha = fecha;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	public FechaGenerada getFecha() {
		return fecha;
	}
	public void setFecha(FechaGenerada fecha) {
		this.fecha = fecha;
	} 
	
	
	public String toString()
	{
		return "[ " + "moneda de origen : " +moneda.getBase_code() + "\n" +
					  "convertida a moneda : " +moneda.getTarget_code() + "\n"+
					  "tipo de cambio el : " + fecha.obtenerFechaConsulta() + " a las  : " + fecha.obtenerHoraConsulta() + "\n" +
					  " valor por moneda : " + moneda.getConversion_rate() + "\n]\n"   ;
	}
	
	
	
	
	
}
