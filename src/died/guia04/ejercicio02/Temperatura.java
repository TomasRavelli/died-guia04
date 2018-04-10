/**
 * 
 */
package died.guia04.ejercicio02;

/**
 * @author tomas
 *}
 */

public class Temperatura {
	Double grados;
	Escala escala;
	
	/**
	 * @param args
	 */
	public Temperatura() {
		this.setGrados(0.0);
		this.setEscala(Escala.CELCIUS);
	}
	public Temperatura(Double d, Escala e) {
		this.setGrados(d);
		this.setEscala(e);
	}
	public void setGrados(Double g) {
		this.grados = g;
	}
	public void setEscala(Escala e) {
		this.escala=e;		
	}
	public Double getGrados () {
		return this.grados;
	}
	public Escala getEscala() {
		return this.escala;
	}
	
	public String toString() {
		String s = new  String();
		if (this.escala == Escala.CELCIUS) {
			s = this.grados + " °C";
		}
		else
			s = this.grados + " °F";
		return s;		
	}
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados;
		}
		else
			return ((this.grados-32.0)*(5.0/9.0));
		
	}
	
	public Double asFahrenheit() {
		if(this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}
		else
			return ((this.grados*(9.0/5.0))+32.0);
		
	}
	
	public Temperatura aumentar (Temperatura t) {
		if(t.grados > 0) {
		if(this.escala == t.escala) {
		this.grados = this.grados + t.grados;
		}
		else {
			if (this.escala == Escala.CELCIUS) 
				this.grados = this.grados + t.asCelcius();
			
			else
				this.grados = this.grados + t.asFahrenheit();
			
		}
		

		return this;
	}
		else { 
			System.out.println("Error: insertar un valor de grados mayor a 0.");
			return this;
		}
	
	}
	

	public Temperatura disminuir (Temperatura t) {
		if(t.grados > 0) {
		if(this.escala == t.escala) {
		this.grados = this.grados - t.grados;
		}
		else {
			if (this.escala == Escala.CELCIUS) {
				this.grados = this.grados - t.asCelcius();
			}
			else
				this.grados = this.grados - t.asFahrenheit();
			
		}
		
		return this;
	}
		else { 
			System.out.println("Error: insertar un valor de grados mayor a 0.");
			return this;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperatura t = new Temperatura();
		System.out.println(t);
	}
	
}
