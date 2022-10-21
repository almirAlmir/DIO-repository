package exercitandoCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listExercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testandoTemperatura();
	}
	
	public static class Temperaturames{
		
		private String mes;
		private Integer temperatura;
		
		
		
		
		public Temperaturames(String mes, Integer temperatura) {
			
			this.mes = mes;
			this.temperatura = temperatura;
		}
		
		public String getMes() {
			return mes;
		}
		public Integer getTemperatura() {
			return temperatura;
		}

		@Override
		public String toString() {
			return "Temperaturas acima da média: [mes=" + mes + ", temperatura=" + temperatura + "]";
		}
		
		
		
	}
	
	public static void testandoTemperatura() {
		
		List<Temperaturames> l1 = new ArrayList<Temperaturames>();
		for(int i=0; i <6;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite a temperatura media do mes");
			int n = input.nextInt();
			String m = null;
			if(i==0) {
				m = "Janeiro";
			}else if(i == 1) {
				m = "Fevereiro";
			}else if(i == 2) {
				m = "Março";
			}else if(i == 3) {
				m = "Abril";
			}else if(i == 4) {
				m = "Maio";
			}else if(i == 5) {
				m = "Junho";
				input.close();
			}
			l1.add(new Temperaturames(m, n));
			
			
			
		}
		double media = getMedia(l1, l1.size());
		int indice = 0;
		while(indice < l1.size()) {
			
			if(l1.get(indice).getTemperatura() > media) {
				indice++;
			}else {
				l1.remove(indice);
			}
			
		}
		
		System.out.println(l1);
	}
	
	public static Double getMedia(List<Temperaturames> a, int b) {
		Double soma = 0.0;
		for(int i = 0; i<b; i++) {

			soma += a.get(i).getTemperatura();
		}
		
		return soma/b;
	}

}
