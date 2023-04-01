package Strings;
import java.util.Scanner;
public class Exercise2Strings {
	public static void main(String[]args) {
		// objetivo: Crie um programa para ler o primeiro nome de uma pessoa e contar quantas vogais esse nome possui.
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o nome a ser analisado");
		String nome = sc.nextLine();
		buscaVogais(nome);
		sc.close();
	}
	public static void buscaVogais(String nome) {
		nome = nome.toLowerCase();
		int A = 0;
		int E = 0;
		int I = 0;
		int O = 0;
		int U = 0;
		
		for(int i = 0; i < nome.length(); i++) {
			char testando = nome.charAt(i);
			if(testando == 'a') {
				A ++;
			}else if(testando == 'e') {
				E ++;
			}else if(testando == 'i') {
				I ++;
			}else if(testando == 'o') {
				O ++;
			}else if(testando == 'u') {
				U ++;
			}
		}
		System.out.printf("O nome %s possui %s letras 'a', %s letras 'e', %s letras 'i', %s letras 'o' e %s letras 'u'\n"
				,nome, A, E, I, O, U);
	}
}
