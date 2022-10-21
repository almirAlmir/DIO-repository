package exercitandoCollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class UsandoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Double> notas = new ArrayList<Double>();
		
		for(int i=0; i <7;i++) {
			Scanner input = new Scanner(System.in);
			notas.add(input.nextDouble());
			System.out.println(notas);
			if(i == 6)
				input.close();
			
		}
		
		notas.add(3, (notas.get(0)+notas.get(6))/2);
		for(Double nota : notas) System.out.println(nota);;
	}

}
