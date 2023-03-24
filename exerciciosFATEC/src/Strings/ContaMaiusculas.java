package Strings;
import java.util.Scanner;
import java.lang.Character;
public class ContaMaiusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira a frase afim de ser avaliada:");
		String frase = sc.nextLine(); 
		System.out.println("a frase: " + frase + " possui " + contaMaiusculas(frase) + " letras maiusculas");
		sc.close();
	}
	public static int contaMaiusculas(String frase) {
		int i, maiusculas = 0;
		for (i = 0; i < frase.length(); i++) {
			Character letra = frase.charAt(i);
			if(Character.isUpperCase(letra)) {
				maiusculas ++;
			}
		}
		return maiusculas;
	}
}
