
public class Triangulooriginal_CGG extends FiguraGeometricaoriginal_CGG {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulooriginal_CGG(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her�n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
