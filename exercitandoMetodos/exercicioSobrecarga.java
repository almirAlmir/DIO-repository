package exercitandoMetodos;

public class exercicioSobrecarga {

	
	public static double areaQuadrilatero(double l) {
		System.out.println("�rea do quadrado:");
		return l*l;
	}
	public static double areaQuadrilatero(double b, double h) {
		System.out.println("�rea do ret�ngulo:");
		return b*h;
	}
	public static double areaQuadrilatero(double h, double b, double bm) {
		System.out.println("�rea do trap�zio:");
		return ((b+bm)*h)/2;
	}
	
	
}
