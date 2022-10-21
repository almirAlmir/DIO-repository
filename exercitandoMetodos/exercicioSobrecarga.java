package exercitandoMetodos;

public class exercicioSobrecarga {

	
	public static double areaQuadrilatero(double l) {
		System.out.println("Área do quadrado:");
		return l*l;
	}
	public static double areaQuadrilatero(double b, double h) {
		System.out.println("Área do retângulo:");
		return b*h;
	}
	public static double areaQuadrilatero(double h, double b, double bm) {
		System.out.println("Área do trapézio:");
		return ((b+bm)*h)/2;
	}
	
	
}
