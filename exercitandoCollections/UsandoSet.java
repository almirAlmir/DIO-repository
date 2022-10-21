package exercitandoCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UsandoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.1, 6.5));
		System.out.println(notas);
		
	
		Iterator<Double> ite = notas.iterator();
		Double soma = 0.0;
		while(ite.hasNext()) {
			
			soma+=ite.next();
			System.out.println(soma);
		}
		
		notas.remove(8.1);
		System.out.println(notas);
		
		System.out.println("______________________________");
		System.out.println("LINKED HASHSET");
		
		Set<Double> notas2 = new LinkedHashSet<Double>();
		
		for(int i=0; i <7;i++) {
			Scanner input = new Scanner(System.in);
			notas2.add(input.nextDouble());
			System.out.println(notas2);
			if(i == 6)
				input.close();
			
		}
		System.out.println("Ordem crescente");
		Set<Double> notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3);
		
		//notas.add(3, (notas.get(0)+notas.get(6))/2);
		//for(Double nota : notas) System.out.println(nota);;
		
	}

}
