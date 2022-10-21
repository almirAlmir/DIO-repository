package exercitandoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class carList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> listaCarros = new ArrayList<Car>();
		listaCarros.add(new Car("Celta", 2012, "verde"));
		listaCarros.add(new Car("Sedan", 2014, "branco"));
		listaCarros.add(new Car("Logan", 2014, "preto"));
		listaCarros.add(new Car("Jeep", 2004, "amarelo"));
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("CARROS ORDENADOS POR ANO DE INSERÇÃO");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println(listaCarros);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println();
		System.out.println("CARROS ORDENADOS POR ANO DE FABRICAÇÃO");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		Collections.sort(listaCarros);
		System.out.println(listaCarros);
		
		
	}

	
	public static class Car implements Comparable<Car>{
		
		private String modelo;
		private Integer ano;
		private String cor;
		
		
		public Car(String modelo, Integer ano, String cor) {
			
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
		}


		public String getModelo() {
			return modelo;
		}


		public Integer getAno() {
			return ano;
		}


		public String getCor() {
			return cor;
		}


		@Override
		public String toString() {
			return "Carro: ["+ modelo +" "+ cor + ", ano=" + ano + "]";
		}


		@Override
		public int compareTo(Car carro) {
			// TODO Auto-generated method stub
			return this.getAno().compareTo(carro.getAno());
		}
		
		
		
		
	}
}
