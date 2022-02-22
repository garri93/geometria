/**
 * 
 * @author Carlos
 * @version 1.2
 */


public class Rectangulooriginal_CGG extends FiguraGeometricaoriginal_CGG {
	private double l1;
	private double l2;
	
	/**
	 * Recoje el tipo de figura y asigna el valor a las variables
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulooriginal_CGG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula el area del rectagulo
	 * @param l1
	 * @param l2
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Calcula el perimetro del rectagulo
	 * @param l1
	 * @param l2
	 * 
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
