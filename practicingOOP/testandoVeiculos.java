package practicingOOP;

public class testandoVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo c1 = new Carro("XXX-1997", 160.0, "azul", 5, "Sedan");
		
		System.out.println(c1);
		
		Veiculo m1 = new Moto("SSJ-3", 200.0, "vermelha", 2);
		
		System.out.println(m1.getAceleracao());
		
		

	}
	
	
	public static class Carro extends Veiculo{
			
		private String modelo;
		
		public Carro(String placa, double aceleracao, String cor, int qtd_assentos, String modelo) {
			super(placa, aceleracao, cor, qtd_assentos);
			this.modelo = modelo;
			// TODO Auto-generated constructor stub
		}

		public String getModelo() {
			return modelo;
		}

		@Override
		public String toString() {
			return "Carro: "+modelo+" "+getCor();
		}

		

	}

	
	public static class Moto extends Veiculo{
		
		
		
		public Moto(String placa, double aceleracao, String cor, int qtd_assentos) {
			super(placa, aceleracao, cor, qtd_assentos);
			
			// TODO Auto-generated constructor stub
		}

		@Override
		public double getAceleracao() {
			// TODO Auto-generated method stub
			System.out.println("Acelerando como nunca a ");
			return super.getAceleracao();
		}
		
		

	}
	
	
	public static class Caminhao extends Veiculo{

		public Caminhao(String placa, double aceleracao, String cor, int qtd_assentos) {
			super(placa, aceleracao, cor, qtd_assentos);
			// TODO Auto-generated constructor stub
		}


	}
	
	
	public static class Veiculo {
		
		private String placa;
		private double aceleracao;
		private String cor;
		private int qtd_assentos;
		private double combustivel_litro;
		private int rodagem;
		
		public Veiculo(String placa, double aceleracao, String cor, int qtd_assentos) {
			super();
			this.placa = placa;
			this.aceleracao = aceleracao;
			this.cor = cor;
			this.qtd_assentos = qtd_assentos;
			this.combustivel_litro = 0.0;
			this.rodagem = 0;
		}

		public double getCombustivel_litro() {
			return combustivel_litro;
		}

		public void setCombustivel_litro(double combustivel_litro) {
			this.combustivel_litro = combustivel_litro;
		}

		public int getRodagem() {
			return rodagem;
		}

		public void setRodagem(int rodagem) {
			this.rodagem = rodagem;
		}

		public String getPlaca() {
			return placa;
		}

		public double getAceleracao() {
			return aceleracao;
		}

		public String getCor() {
			return cor;
		}

		public int getQtd_assentos() {
			return qtd_assentos;
		}
		
		
		
		

	}

}
