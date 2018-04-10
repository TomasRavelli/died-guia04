/**
 * 
 */
package died.guia04.ejercicio01;

/**
 * @author Tomas
 *
 */
public class Recta {
	Punto punto1, punto2;
	/**
	 * @param args
	 */
	public Recta(Punto p1, Punto p2) {
		punto1 = new Punto(p1.getCordenadaX(),p1.getCordenadaY());
		punto2 = new Punto(p2.getCordenadaX(), p2.getCordenadaY());
	}
	public  Recta() {
		punto1 = new Punto(1,1);	
		punto2 = new Punto(2,2);	
		
	}
	
	public float pendiente() {
		return ((this.punto2.getCordenadaY()-this.punto1.getCordenadaY())/(this.punto2.getCordenadaX()-this.punto1.getCordenadaY()));
	}
	public boolean paralelas(Recta r2) {
		if(this.pendiente() == r2.pendiente()) {
			return true;
		}else 
		return  false;
	}
	
	public boolean equals (Recta r) {
		Punto pto1, pto2;
		Recta r2;
		pto1 = this.punto1;
		pto2 = r.punto1;
		r2 = new Recta(pto1,pto2);
		if ((r2.pendiente() == this.pendiente()) && (r2.pendiente() == r.pendiente())) {
			return true;
		}else
		
		return false;
	}
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
	