package data;

import java.io.IOException;

public class Moneda {
	
	private String base_code ;  /// de UNA MONEDA ESCOGIDA
	private String target_code;  ///  al cambio en su otra moneda
	private double conversion_rate ;
	
	
	public String toString()
	{
		
		return "moneda :" + base_code + "\n" +
				"convertida a :"+target_code+ "\n"+
				"valor de cambio :" + conversion_rate +"\n";
	}
	
	public String getBase_code() {
		return base_code;
	}
	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}
	public String getTarget_code() {
		return target_code;
	}
	public void setTarget_code(String target_code) {
		this.target_code = target_code;
	}
	public double getConversion_rate() {
		return conversion_rate;
	}
	public void setConversion_rate(double conversion_rate) {
		this.conversion_rate = conversion_rate;
	}
	public Moneda(String base_code, String target_code, double conversion_rate) {
		super();
		this.base_code = base_code;
		this.target_code = target_code;
		this.conversion_rate = conversion_rate;
	}
	public Moneda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String[] tipoMonedas()
	{
		String monedas[] = {"USD","ARS","BRL","COP","PEN","CLP"} ;
		return monedas ;
	}
	
 
	
	
	public Moneda devolverMoneda(String baseCode , String targetCode) throws IOException, InterruptedException
	{
		TesteoMoneda testeo = new TesteoMoneda() ; 
			return	testeo.tipoCambio(baseCode, targetCode);
		
		
		
	}
	
	public Moneda devolverMonedaxOpcion(int opcion ) throws IOException, InterruptedException
	{
		 String baseCode ="";
		 String targetCode="";
		switch(opcion)
		{
			case 1 :
			baseCode=tipoMonedas()[0];
			targetCode=tipoMonedas()[1];
			break;
		
			case 2:
			baseCode=tipoMonedas()[1];
			targetCode=tipoMonedas()[0];
			break ;
			
			case 3 :
			baseCode=tipoMonedas()[0];
			targetCode=tipoMonedas()[2];
			break ;
			
			case 4:
			baseCode=tipoMonedas()[2];
			targetCode=tipoMonedas()[0];
			break ;	
			
			case 5 :
			baseCode=tipoMonedas()[0];
			targetCode=tipoMonedas()[3];
			break ;	
			
			case 6 :
			baseCode=tipoMonedas()[3];
			targetCode=tipoMonedas()[0];
			break ;
			case 7:
			baseCode=tipoMonedas()[0];
			targetCode=tipoMonedas()[4];
			break ;	
			case 8:
			baseCode=tipoMonedas()[4];
			targetCode=tipoMonedas()[0];
			break ;	
				
			
			
		}
	
	TesteoMoneda test = new TesteoMoneda();
	Moneda moneda = test.tipoCambio(baseCode, targetCode);
  
		return moneda ; 
		
	}
	
	
	
	public double convertirDeDolarAMoneda(  int cantBaseCode  , int opcion) throws IOException, InterruptedException
	{
		double montoBase =  0  ;
		double montoTarget = 0;  /// estos montos se acceden al llamar mediante gson a la api
		String baseCode="";
		String targetCode="";
		Moneda monedaEncontrada = devolverMonedaxOpcion(opcion);
		baseCode  =monedaEncontrada.getBase_code();
		targetCode = monedaEncontrada.getTarget_code();
 		montoBase =monedaEncontrada.getConversion_rate() ; 
		montoTarget  = montoBase*cantBaseCode;
		
		return montoTarget  ; 
	}
	
	 
	
	
	

}
