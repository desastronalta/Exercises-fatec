package Métodos;
import java.util.Scanner;
public class Exercicio3metodos {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double nota1,nota2;
		System.out.println("insira o tipo de calculo desejado, 'P' para media pondera e 'A' para media aritimetica");
		String tipo = sc.next();
		System.out.println("insira o valor da primeira nota");
		nota1 = sc.nextDouble();
		System.out.println("insira o valor da segunda nota");
		nota2 = sc.nextDouble();
		sc.close();
		calcularMedia(nota1, nota2, tipo);
	}
	public static void calcularMedia(double nota1, double nota2, String tipo) {
		double média = 0; 
		if( tipo.equalsIgnoreCase("A")) {
			média = (nota1 + nota2)/2;
			System.out.printf("A media e: %.1f" , média);
		}else if(tipo.equalsIgnoreCase("P")) {
			média =(7 * nota1 + 3 * nota2 )/10;
			System.out.printf("A media e: %.1f" , média);
		}else System.out.println("vc provavelmente digitou a letra errada, por favor tentar novamente.");
	}
}
