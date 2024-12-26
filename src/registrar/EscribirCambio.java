package registrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import intermadia.ClaseIntermedia;

public class EscribirCambio {
	
		
			public void registrarTransaccion(List<ClaseIntermedia> clase, String ruta)
			{
				
				try {
					File file = new File(ruta);
					FileWriter fw = new FileWriter(file,true);
					fw.write(clase.toString());
					fw.close();
					System.out.println("registro correcto en la ruta : " + ruta);
					
					
					
					
				} catch (FileNotFoundException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
	
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
	
				}
				
				
				
				
			}
		
	
	
	

}
