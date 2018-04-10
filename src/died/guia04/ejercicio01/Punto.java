/**
 * 
 */
package died.guia04.ejercicio01;

/**
 * @author tomas
 *
 */
public class Punto {
	float cordenadaX, cordenadaY;

	/**
	 * @param args
	 */
	public Punto(float x, float y) {
		this.setCordenadaX(x);
		this.setCordenadaY(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(1,2);
		System.out.println("Nuevo punto Creado(X,Y): (" + punto1.getCordenadaX() + ", " + punto1.getCordenadaY() + ")");
		System.out.println(punto1.equals(punto2));
		
	
	}
	public float getCordenadaX() {
		return cordenadaX;
	}
	public void setCordenadaX(float cordenadaX) {
		this.cordenadaX = cordenadaX;
	}
	public float getCordenadaY() {
		return cordenadaY;
	}
	public void setCordenadaY(float cordenadaY) {
		this.cordenadaY = cordenadaY;
	}

	public boolean  equals (Punto punto2) {
		if(punto2.cordenadaX == this.cordenadaX && punto2.cordenadaY == this.cordenadaY) {
			return true;
		} else
			return false;
	}
	}

