package Métodos;
import java.util.Scanner;
public class Exercicio1metodos {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		System.out.println(verificaValor(valor));
		sc.close();
	}
	public static  String verificaValor(int valor) {
		String teste;
		if(valor%2 == 0  ) { 
		teste = "o valor inserido e par.";
		}
		else { teste =("o valor inserido e impar.");
		}
		return teste;
	}
}
