package Métodos;
import java.util.Scanner; 
public class Exercicio2metodos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("A soma dos valores e:" + somarValores(num1,num2));
		sc.close();
	}
	public static int somarValores(int valor1, int valor2) {
		int soma = valor1 + valor2;
		return soma;
		
	}
}
