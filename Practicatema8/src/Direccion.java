
public class Direccion {
	
	protected static String calle;
	protected static int cp;
	protected static String provincia;
	
	public Direccion(String call, int cp, String prov) {
		
		calle=call;
		this.cp=cp;
		provincia=prov;
		
	}
	
	public String getCalle() {
		
		return calle;
		
	}
	
	public int getCp() {
		
		return cp;
	}
	
	public String getProvincia() {
		
		return provincia;
		
	}
	
	
}
