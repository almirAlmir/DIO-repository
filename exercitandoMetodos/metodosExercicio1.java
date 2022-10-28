package exercitandoMetodos;

import java.util.Date;
import java.util.Scanner;
import javax.swing.*;

public class metodosExercicio1 {

	public static void main(String[] args) {

		while (true) {

			try {
				String x = JOptionPane.showInputDialog("Digite primeiro numero");
				String ope = JOptionPane.showInputDialog("Digite uma das operacoes '+' '-' 'x' '/'");
				String y = JOptionPane.showInputDialog("Digite segundo numero");

				int result = (int) calculadora(Double.parseDouble(x), ope.charAt(0), Double.parseDouble(y));
				System.out.println(result);

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}catch(NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Programa encerrado!!!");
				break;
			}

		}
	}

	public static double calculadora(double x, char ope, double y) {
		Scanner input = new Scanner(System.in);

		double n = 0;

		switch (ope) {

		case '+':
			n = sum(x, y);
			break;
		case '-':
			n = sum(x, -y);
			break;
		case 'x':
			n = mult(x, y);
			break;
		case '/':
			n = mult(x, 1 / y);
			break;
		default:
			System.out.println("Operaçao nao reconhecida pelo Software");
		}
		input.close();
		return n;
	}

	public static double sum(double x, double y) {

		return x + y;
	}

	public static double mult(double x, double y) {

		return x * y;
	}

	public static void testandoCalculadora() {

		Scanner input = new Scanner(System.in);

		double x = input.nextDouble();
		double y = input.nextDouble();

		System.out.println("Soma: " + calculadora(x, "+".charAt(0), y));
		System.out.println("Mult: " + calculadora(x, "x".charAt(0), y));
		System.out.println("Sub: " + calculadora(x, "-".charAt(0), y));
		System.out.println("Div: " + calculadora(x, "/".charAt(0), y));

		input.close();
	}

	@SuppressWarnings("deprecation")
	public static void cumprimentoDiario() {
		Date date = new Date();

		if (date.getHours() < 12) {
			System.out.println("Bom dia!");
		} else if (date.getHours() >= 18) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Boa tarde!");
		}

	}

	public static void testandoCumprimento() {

		cumprimentoDiario();
	}

	public static double meEmpresta(double valor) {
		Scanner input = new Scanner(System.in);
		double n = 0;

		System.out.println("Quer parcelar em quantas vezes?");
		int x = input.nextInt();

		if (x <= 6) {
			n = valor + (valor * 20) / 100;
		} else {
			n = incrementaDivida(valor, x);
		}

		System.out.printf("O pagamento será feito em " + x + "X de R$ %.2f", calculadora(n, "/".charAt(0), x));
		System.out.println();
		input.close();
		return n;
	}

	public static double incrementaDivida(double valor, int parcela) {

		double n = valor + (valor * 20) / 100;
		int i = 7;

		while (i <= parcela) {
			// Se a parcela for até 12 meses acrescimo de 2,5% do emprestimo.
			// Do 13° mes em diante acrescimo de 0,8% da dívida atual.
			if (i > 12) {
				n = n + (n * 0.8) / 100;
			} else {
				n = n + (valor * 2.5) / 100;
			}
			i++;
		}

		return n;
	}

	public static void testandoEmprestimo() {

		System.out.printf("Valor total da dívida %.2f", meEmpresta(1200));
	}

}
