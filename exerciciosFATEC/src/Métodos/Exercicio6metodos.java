package Métodos;
import java.util.Scanner;
public class Exercicio6metodos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira um valor para saber se ele é um numero perfeito ou nao.");
		int numero = sc.nextInt();
		System.out.println(testaPerfeito(numero));
		sc.close();
	}
	public static String testaPerfeito(int numero) {
		String result = null;
		int i = 1;
		int soma = 0;
		while(i < numero) {
			if(numero%i == 0) {
				soma += i;
			}
			i++;
		}
		if(soma == numero) {
			result = "o valor inserido e um numero perfeito";
		}else result = "o valor inserido nao e um numero perfeito";
		return result;		
	}
}
